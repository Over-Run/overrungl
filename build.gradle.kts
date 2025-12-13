import org.jreleaser.model.Active
import java.net.http.HttpClient
import java.time.LocalDate

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
            overwrite = projVersion.endsWith("-SNAPSHOT")
            prerelease {
                pattern = ".*-(alpha|beta|rc)\\.\\d+"
            }
            releaseNotes {
                enabled = true
                configurationFile = ".github/release.yml"
                milestone {
                    close = false
                }
            }
            changelog {
                enabled = false
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

tasks.register("updateKhr") {
    val token = rootProject.findProperty("overrungl.native.download.github.token") as String?
        ?: System.getProperty("OVERRUNGL_NATIVE_DOWNLOAD_GITHUB_TOKEN")
        ?: System.getenv("OVERRUNGL_NATIVE_DOWNLOAD_GITHUB_TOKEN")
    val glXml = project(":generators:opengl").projectDir.resolve("src/main/resources/gl.xml")
    val vkRes = project(":generators:vulkan").projectDir.resolve("src/main/resources/")
    val vkXml = vkRes.resolve("vk.xml")
    val videoXml = vkRes.resolve("video.xml")

    doLast {
        suggestGitHubToken(token)

        val httpClient = HttpClient.newBuilder()
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build()
        httpClient.downloadRepoFile(token, "KhronosGroup", "Vulkan-Docs", "xml/vk.xml", vkXml)
        httpClient.downloadRepoFile(token, "KhronosGroup", "Vulkan-Docs", "xml/video.xml", videoXml)
        httpClient.downloadRepoFile(token, "KhronosGroup", "OpenGL-Registry", "xml/gl.xml", glXml)
    }
}

ext["lwjglNatives"] = Pair(
    System.getProperty("os.name")!!,
    System.getProperty("os.arch")!!
).let { (name, arch) ->
    when {
        "FreeBSD".equals(name) ->
            "natives-freebsd"

        arrayOf("Linux", "SunOS", "Unit").any { name.startsWith(it) } ->
            if (arrayOf("arm", "aarch64").any { arch.startsWith(it) })
                "natives-linux${if (arch.contains("64") || arch.startsWith("armv8")) "-arm64" else "-arm32"}"
            else if (arch.startsWith("ppc"))
                "natives-linux-ppc64le"
            else if (arch.startsWith("riscv"))
                "natives-linux-riscv64"
            else
                "natives-linux"

        arrayOf("Mac OS X", "Darwin").any { name.startsWith(it) } ->
            "natives-macos${if (arch.startsWith("aarch64")) "-arm64" else ""}"

        arrayOf("Windows").any { name.startsWith(it) } ->
            if (arch.contains("64"))
                "natives-windows${if (arch.startsWith("aarch64")) "-arm64" else ""}"
            else
                "natives-windows-x86"

        else ->
            throw Error("Unrecognized or unsupported platform. Please set \"lwjglNatives\" manually")
    }
}
