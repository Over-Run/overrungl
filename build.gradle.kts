import groovy.json.JsonSlurper
import org.gradle.kotlin.dsl.support.unzipTo
import org.jreleaser.model.Active
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.nio.file.Files
import java.security.DigestInputStream
import java.security.MessageDigest
import java.time.LocalDate
import kotlin.io.path.createDirectories
import kotlin.io.path.exists
import kotlin.io.path.writeText
import kotlin.jvm.optionals.getOrNull

plugins {
    `java-platform`
    `maven-publish`
    id("org.jreleaser") version "1.20.0"
}

val projGroupId: String by rootProject
val projVersion: String by rootProject

val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject
val jdkEarlyAccessDoc: String? by rootProject

val targetJavaVersion = jdkVersion.toInt()

group = projGroupId
version = projVersion

allprojects {
    tasks.withType<Javadoc> {
        options {
            if (this is CoreJavadocOptions) {
                if (jdkEnablePreview.toBoolean()) {
                    addBooleanOption("-enable-preview", true)
                }
                addStringOption("source", targetJavaVersion.toString())
                if (this is StandardJavadocDocletOptions) {
                    charSet = "UTF-8"
                    docEncoding = "UTF-8"
                    isAuthor = true
                    if (jdkEarlyAccessDoc == null) {
                        links("https://docs.oracle.com/en/java/javase/$targetJavaVersion/docs/api/")
                    } else {
                        links("https://download.java.net/java/early_access/$jdkEarlyAccessDoc/docs/api/")
                    }

                    // javadoc does not accept multiline string, thus we must use concatenation
                    bottom =
                        """<a href="https://github.com/Over-Run/overrungl">Sources</a> &bull; """ +
                            """<a href="https://github.com/Over-Run/overrungl/issues">Issues</a> &bull; """ +
                            """<a href="https://github.com/Over-Run/overrungl/discussions">Discussions</a><br>""" +
                            """Copyright © 2022-${LocalDate.now().year} Overrun Organization<br>""" +
                            """<b>$projVersion (JVM ${Runtime.version()})</b>"""


                    // shut up the javadoc
                    addStringOption("Xdoclint:all,-missing", "-quiet") // the value is required for no reason!!
                }
            }
            encoding = "UTF-8"
            locale = "en_US"
            windowTitle = "OverrunGL $projVersion"
            jFlags("-Duser.language=en-US")
        }
        title = "OverrunGL $projVersion"
        isFailOnError = false
    }
}

publishing.publications {
    create<MavenPublication>("overrunglBOM") {
        from(components["javaPlatform"])
        artifactId = "overrungl-bom"
        pom {
            setupPom("OverrunGL BOM", "OverrunGL Bill of Materials.", "pom")
        }
    }
}

publishing.repositories {
    maven {
        name = "stagingRepo"
        setUrl(layout.buildDirectory.dir("staging-deploy"))
    }
    mavenLocal()
}

// check https://jreleaser.org/guide/latest/examples/maven/maven-central.html#_gradle
jreleaser {
    signing {
        active = Active.ALWAYS
        armored = true
    }
    release {
        github {
            repoOwner = "Over-Run"
            name = "overrungl"
            username = "squid233"
            update {
                enabled = true
                section("BODY")
                section("ASSETS")
            }
            prerelease {
                pattern = ".*-(alpha|beta|rc)\\.\\d+"
            }
            changelog {
                formatted = Active.ALWAYS
                preset = "conventional-commits"
            }
        }
    }
    deploy {
        maven {
            mavenCentral {
                create("release-deploy") {
                    active = Active.RELEASE
                    url = "https://central.sonatype.com/api/v1/publisher"
                    stagingRepository("build/staging-deploy")
                }
            }
            nexus2 {
                create("snapshot-deploy") {
                    active = Active.SNAPSHOT
                    snapshotUrl = "https://central.sonatype.com/repository/maven-snapshots/"
                    applyMavenCentralRules = true
                    snapshotSupported = true
                    closeRepository = true
                    releaseRepository = true
                    stagingRepository("build/staging-deploy")
                }
            }
        }
    }
}

tasks.register("downloadLatestNatives") {
    val token = rootProject.findProperty("overrungl.native.download.github.token") as String?
        ?: System.getProperty("OVERRUNGL_NATIVE_DOWNLOAD_GITHUB_TOKEN")
        ?: System.getenv("OVERRUNGL_NATIVE_DOWNLOAD_GITHUB_TOKEN")
    val nativesPath = rootDir.resolve("natives").toPath()
    val nativesInfoPath = nativesPath.resolve("info")
    val nativesInfoETagPath = nativesInfoPath.resolve("etag.json")
    val nativesInfoBindingJsonMap = NativeBinding.entries.associateWith { binding ->
        nativesInfoPath.resolve("${binding.bindingName}.json")
    }
    val nativesZipETagPath = nativesPath.resolve("etag.json")
    val nativesBindingZipMap = NativeBinding.entries.associateWith { binding ->
        nativesPath.resolve("${binding.bindingName}.zip")
    }

    doLast {
        if (token == null) {
            throw IllegalStateException("GitHub token not found; please specify project property overrungl.native.download.github.token or system property or environment variable OVERRUNGL_NATIVE_DOWNLOAD_GITHUB_TOKEN")
        }

        nativesPath.createDirectories()
        nativesInfoPath.createDirectories()

        println("Downloading latest native library builds")

        val httpClient = HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build()

        // https://docs.github.com/en/rest/using-the-rest-api/best-practices-for-using-the-rest-api?apiVersion=2022-11-28

        // ETag
        val infoETagMap = mutableMapOf<String, String>()
        if (nativesInfoETagPath.exists()) {
            val map = JsonSlurper().parse(nativesInfoETagPath) as Map<*, *>
            map.forEach { (k, v) -> infoETagMap[k as String] = v as String }
        }
        val zipETagMap = mutableMapOf<String, String>()
        if (nativesZipETagPath.exists()) {
            val map = JsonSlurper().parse(nativesZipETagPath) as Map<*, *>
            map.forEach { (k, v) -> zipETagMap[k as String] = v as String }
        }

        // fetch release info
        NativeBinding.entries.forEach { binding ->
            println("Fetching release information for ${binding.bindingName} from ${binding.repo}")

            val request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/repos/${binding.repo}/releases/latest"))
                .header("Accept", "application/vnd.github+json")
                .header("Authorization", "Bearer $token")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .also {
                    infoETagMap[binding.bindingName].also { eTag ->
                        if (eTag != null && nativesInfoBindingJsonMap[binding]!!.exists()) {
                            it.header("if-none-match", "\"$eTag\"")
                        }
                    }
                }
                .build()
            val response = httpClient.send(request, HttpResponse.BodyHandlers.ofString())

            if (response.statusCode() == 304) {
                println("Skipped for ${binding.bindingName}.json because it is not modified")
                return@forEach
            }

            if (response.statusCode() != 200) {
                System.err.println("warning: ${binding.bindingName}: response code: ${response.statusCode()}")
                return@forEach
            }

            val eTag = response.headers().firstValue("etag").getOrNull()
            if (eTag != null) {
                infoETagMap[binding.bindingName] = eTag.substring(1, eTag.length - 1)
            }

            nativesInfoBindingJsonMap[binding]!!.writeText(response.body())
        }

        // cache info ETag
        println("Caching release information")
        nativesInfoETagPath.writeText(buildString {
            append("{")
            infoETagMap.entries.joinTo(this, separator = ",") {
                "\"${it.key}\":\"${it.value}\""
            }
            append("}")
        })


        // download assets
        val invalidZips = mutableListOf<String>()
        NativeBinding.entries.forEach { binding ->
            println("Downloading asset for ${binding.bindingName}")

            val map = JsonSlurper().parse(nativesInfoBindingJsonMap[binding]!!) as Map<*, *>
            val assets = (map["assets"] as List<*>).let { it.map { e -> e as Map<*, *> } }
            val asset = assets.first { it["name"] == "${binding.bindingName}.zip" }
            val zipPath = nativesBindingZipMap[binding]!!

            val request = HttpRequest.newBuilder()
                .uri(URI.create(asset["url"] as String))
                .header("Accept", "application/octet-stream")
                .header("Authorization", "Bearer $token")
                .header("X-GitHub-Api-Version", "2022-11-28")
                .also {
                    zipETagMap[binding.bindingName].also { eTag ->
                        if (eTag != null && zipPath.exists()) {
                            it.header("if-none-match", "\"$eTag\"")
                        }
                    }
                }
                .build()
            val response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream())

            if (response.statusCode() == 304) {
                println("Skipped for ${binding.bindingName}.zip because it is not modified")
                response.body().close()
                return@forEach
            }

            if (response.statusCode() != 200) {
                System.err.println("warning: ${binding.bindingName}: response code: ${response.statusCode()}")
                response.body().close()
                return@forEach
            }

            val eTag = response.headers().firstValue("etag").getOrNull()
            if (eTag != null) {
                zipETagMap[binding.bindingName] = eTag.substring(1, eTag.length - 1)
            }

            Files.newOutputStream(zipPath).buffered().use { os ->
                response.body().buffered().use { it.transferTo(os) }
            }

            // validate
            println("Validating ${binding.bindingName}.zip")
            val sha256 = (asset["digest"] as String?)?.substringAfter("sha256:")
            if (sha256 == null) {
                System.err.println("warning: digest for ${binding.bindingName}.zip is null")
                return@forEach
            }
            val md = MessageDigest.getInstance("SHA-256")
            DigestInputStream(Files.newInputStream(zipPath), md).use {
                it.readAllBytes()
            }
            val byteArray = sha256.windowed(2, step = 2)
                .map { it.toUByte(16).toByte() }
                .toByteArray()
            val digest = md.digest()
            if (!byteArray.contentEquals(digest)) {
                invalidZips.add(binding.bindingName)
            }
        }

        // cache zip ETag
        println("Caching zip information")
        nativesZipETagPath.writeText(buildString {
            append("{")
            zipETagMap.entries.joinTo(this, separator = ",") {
                "\"${it.key}\":\"${it.value}\""
            }
            append("}")
        })

        if (invalidZips.isNotEmpty()) {
            throw IllegalStateException(
                "these files are incomplete or broken; please delete them and rerun this task:\n${
                    invalidZips.joinToString(separator = "\n") { "    $it.zip" }
                }"
            )
        }


        // extract files
        NativeBinding.entries.forEach { binding ->
            println("Extracting ${binding.bindingName}.zip")
            unzipTo(nativesPath.toFile(), nativesBindingZipMap[binding]!!.toFile())
        }
    }
}
