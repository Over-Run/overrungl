import org.gradle.plugins.ide.idea.model.IdeaModel
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.nio.file.Files
import kotlin.io.path.Path

plugins {
    `java-platform`
    `maven-publish`
    signing
    id("me.champeau.jmh") version "0.7.1" apply false
    embeddedKotlin("jvm") apply false
}

val projGroupId: String by project
val projArtifactId: String by project
val projName: String by project
val projVersion: String by project
val projVcs: String by project
val projBranch: String by project
val orgName: String by project
val orgUrl: String by project
val developers: String by project

val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject
val jdkEarlyAccessDoc: String? by rootProject
val kotlinTargetJdkVersion: String by rootProject

val targetJavaVersion = jdkVersion.toInt()

group = projGroupId
version = projVersion

project(":core").ext["subName"] = ""
Artifact.values().forEach { project(it.subprojectName).ext["subName"] = "-${it.subprojectName.substring(1)}" }
project(":samples").ext["subName"] = "-samples"

enum class NativePlatform(
    val osFamilyName: String,
    val osArch: String,
    classifier: String,
    val nativeLibPrefix: String,
    val nativeLibSuffix: String,
    val taskSuffix: String
) {
    WIN_64("windows", "x64", "windows", "", ".dll", "Win64"),
    WIN_ARM64("windows", "arm64", "windows-arm64", "", ".dll", "WinArm64"),
    LINUX_64("linux", "x64", "linux", "lib", ".so", "Linux64"),
    LINUX_ARM32("linux", "arm32", "linux-arm32", "lib", ".so", "LinuxArm32"),
    LINUX_ARM64("linux", "arm64", "linux-arm64", "lib", ".so", "LinuxArm64"),
    MACOS("macos", "x64", "macos", "lib", ".dylib", "Macos"),
    MACOS_ARM64("macos", "arm64", "macos-arm64", "lib", ".dylib", "MacosArm64");

    companion object {
        val ALL = values()
    }

    val classifier = "natives-$classifier"
}

enum class NativeBinding(
    val bindingName: String,
    val basename: String,
    vararg val platforms: NativePlatform
) {
    GLFW(
        "glfw", "glfw3",
        NativePlatform.WIN_64,
        NativePlatform.LINUX_64, NativePlatform.LINUX_ARM64,
        NativePlatform.MACOS, NativePlatform.MACOS_ARM64
    ),
    NFD("nfd", "nfd", *NativePlatform.ALL),
    STB("stb", "stb", *NativePlatform.ALL)
}

enum class Artifact(
    val artifactName: String,
    val projectName: String,
    val projectDescription: String,
    val subprojectName: String,
    val mavenName: String,
    val nativeBinding: NativeBinding? = null
) {
    CORE(
        "overrungl", "OverrunGL",
        "The OverrunGL core library.",
        ":core", "Core"
    ),
    GLFW(
        "overrungl-glfw", "OverrunGL - GLFW bindings",
        "A multi-platform library for OpenGL, OpenGL ES and Vulkan development on the desktop. It provides a simple API for creating windows, contexts and surfaces, receiving input and events.",
        ":glfw", "Glfw", NativeBinding.GLFW
    ),
    JOML(
        "overrungl-joml", "OverrunGL - JOML native access",
        "A Java math library for OpenGL rendering calculations",
        ":joml", "Joml"
    ),
    NFD(
        "overrungl-nfd", "OverrunGL - Native File Dialog",
        "A tiny, neat C library that portably invokes native file open and save dialogs.",
        ":nfd", "Nfd", NativeBinding.NFD
    ),
    OPENGL(
        "overrungl-opengl", "OverrunGL - OpenGL bindings",
        "The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms.",
        ":opengl", "Opengl"
    ),
    STB(
        "overrungl-stb", "OverrunGL - stb bindings",
        "Single-file public domain libraries for fonts, images, ogg vorbis files and more.",
        ":stb", "Stb", NativeBinding.STB
    ),
    //VULKAN("overrungl-vulkan", "OverrunGL - Vulkan bindings",
    //    "A new generation graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.",
    //    ":vulkan", "Vulkan", null),
    ;

    fun nativeFileName(platform: NativePlatform): String? {
        return if (nativeBinding == null) null
        else "${nativeBinding.bindingName}/${platform.osFamilyName}/${platform.osArch}/${platform.nativeLibPrefix}${nativeBinding.basename}${platform.nativeLibSuffix}"
    }
}

subprojects {
    apply(plugin = "java-library")
    apply(plugin = "idea")
    apply(plugin = "me.champeau.jmh")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = projGroupId
    version = projVersion
    val artifactName = "$projArtifactId${ext["subName"]}"

    repositories {
        mavenCentral()
        maven { url = uri("https://maven.aliyun.com/repository/central") }
        // temporary maven repositories
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/releases") }
        maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots") }
    }

    val compileOnly by configurations
    val implementation by configurations
    dependencies {
        compileOnly("org.jetbrains:annotations:24.1.0")
        if (project.name != "core") {
            implementation(project(":core"))
        }
    }

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        if (jdkEnablePreview.toBoolean()) options.compilerArgs.add("--enable-preview")
        options.release.set(targetJavaVersion)
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions { jvmTarget = kotlinTargetJdkVersion }
    }

    tasks.withType<Test> {
        if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    }

    extensions.configure<JavaPluginExtension>("java") {
        val javaVersion = JavaVersion.toVersion(targetJavaVersion)
        if (JavaVersion.current() < javaVersion) {
            toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))
        }
        withJavadocJar()
        withSourcesJar()
    }

    tasks.named<Jar>("jar") {
        manifestContentCharset = "utf-8"
        metadataCharset = "utf-8"
        manifest.attributes(
            "Specification-Title" to projName,
            "Specification-Vendor" to "Overrun Organization",
            "Specification-Version" to projVersion.split('.', limit = 2)[0],
            "Implementation-Title" to projName,
            "Implementation-Vendor" to "Overrun Organization",
            "Implementation-Version" to projVersion
        )
        archiveBaseName.set(artifactName)
        from("LICENSE")
    }

    tasks.named<Jar>("sourcesJar") {
        dependsOn(tasks["classes"])
        archiveBaseName.set(artifactName)
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource, "LICENSE")
    }

    tasks.named<Jar>("javadocJar") {
        val javadoc by tasks
        dependsOn(javadoc)
        archiveBaseName.set(artifactName)
        archiveClassifier.set("javadoc")
        from(javadoc, "LICENSE")
    }

    artifacts {
        archives(tasks["sourcesJar"])
        archives(tasks["javadocJar"])
    }

    the<IdeaModel>().module.inheritOutputDirs = true
}

tasks.register("assembleJavadocArgs") {
    group = "build"
    val mspFile = Path("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args")
    outputs.file(mspFile)

    doLast {
        Files.deleteIfExists(mspFile)

        Files.writeString(mspFile, """
            --module-source-path
            ${rootProject.projectDir.path}/modules/*/src/main/java
        """.trimIndent())
    }
}

tasks.register<Javadoc>("aggregateJavadoc") {
    dependsOn(tasks["assembleJavadocArgs"])
    group = "documentation"
    outputs.upToDateWhen { false }
    val projectsToDoc = Artifact.values().map { project(it.subprojectName) }
    dependsOn(projectsToDoc.map { it.getTasksByName("classes", true) })
    source(projectsToDoc.map { it.sourceSets["main"].java })
    destinationDir = File("${layout.buildDirectory.get().asFile}/docs/javadoc")

    classpath = files(projectsToDoc.map { it.configurations["compileClasspath"].files })

    executable = project.findProperty("javadocExecutable") as String?

    options.optionFiles = listOf(File("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args"))
}

allprojects {
    tasks.withType<Javadoc> {
        options {
            if (this is CoreJavadocOptions) {
                addBooleanOption("-enable-preview", true)
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

                    tags(
                        "glfw.errors:m:Errors:",
                        "glfw.remark:m:Remarks:",
                        "glfw.thread_safety:m:Thread safety:",
                        "glfw.warning:m:Warning:",
                        "glfw.reentrancy:m:Reentrancy:",
                        "glfw.pointer_lifetime:m:Pointer lifetime:",
                        "glfw.callback_signature:m:Callback signature:",
                        "glfw.note:m:Note:"
                    )

                    bottom = "<a href=\"https://github.com/Over-Run/overrungl/issues\">Report a bug or suggest an enhancement</a><br>" +
                        "Copyright © 2022-2023 Overrun Organization<br>" +
                        "<b>$projVersion</b>"
                }
            }
            encoding = "UTF-8"
            locale = "en_US"
            windowTitle = "OverrunGL $projVersion"
        }
        title = "OverrunGL $projVersion"
        isFailOnError = false
    }
}

publishing.publications {
    fun MavenPom.setupPom(pomName: String, pomDescription: String, pomPackaging: String) {
        name.set(pomName)
        description.set(pomDescription)
        url.set("https://github.com/$projVcs")
        packaging = pomPackaging
        licenses {
            license {
                name.set("MIT")
                url.set("https://raw.githubusercontent.com/$projVcs/$projBranch/LICENSE")
            }
        }
        organization {
            name.set(orgName)
            url.set(orgUrl)
        }
        scm {
            connection.set("scm:git:https://github.com/${projVcs}.git")
            developerConnection.set("scm:git:https://github.com/${projVcs}.git")
            url.set("https://github.com/${projVcs}.git")
        }
    }

    Artifact.values().forEach { module ->
        create<MavenPublication>("maven${module.mavenName}") {
            groupId = projGroupId
            artifactId = module.artifactName
            version = projVersion
            description = module.projectDescription
            project(module.subprojectName) {
                artifact(tasks["jar"])
                artifact(tasks["sourcesJar"]) { classifier = "sources" }
                artifact(tasks["javadocJar"]) { classifier = "javadoc" }
            }
            module.nativeBinding?.platforms?.forEach {
                val nativeName = module.nativeFileName(it)!!
                val file = File("${rootProject.projectDir}/natives/$nativeName")
                if (file.exists()) {
                    val nativeParent = File(nativeName).parent
                    artifact(tasks.create<Jar>("nativeJar${module.mavenName}${it.taskSuffix}") {
                        archiveBaseName.set(module.artifactName)
                        archiveClassifier.set(it.classifier)
                        from(file) { into(nativeParent) }
                    })
                }
            }
            pom {
                setupPom(module.projectName, module.projectDescription, "jar")
                if (module != Artifact.CORE) {
                    withXml {
                        asNode().appendNode("dependencies").appendNode("dependency").apply {
                            appendNode("groupId", "io.github.over-run")
                            appendNode("artifactId", "overrungl")
                            appendNode("version", projVersion)
                            appendNode("scope", "compile")
                        }
                    }
                }
            }
        }
    }

    create<MavenPublication>("overrunglBOM") {
        from(components["javaPlatform"])
        artifactId = "overrungl-bom"
        pom {
            fun org.w3c.dom.Node.appendBOM(platform: NativePlatform?, module: Artifact) {
                ownerDocument.createElement("dependency").also(::appendChild).apply {
                    appendChild(
                        ownerDocument.createElement("groupId").also(::appendChild)
                            .apply { textContent = "io.github.over-run" })
                    appendChild(
                        ownerDocument.createElement("artifactId").also(::appendChild)
                            .apply { textContent = module.artifactName })
                    appendChild(
                        ownerDocument.createElement("version").also(::appendChild)
                            .apply { textContent = projVersion })
                    if (platform != null) {
                        appendChild(
                            ownerDocument.createElement("classifier").also(::appendChild)
                                .apply { textContent = platform.classifier })
                    }
                }
            }

            setupPom("OverrunGL BOM", "OverrunGL Bill of Materials.", "pom")
            withXml {
                asElement().getElementsByTagName("dependencyManagement").item(0).apply {
                    asElement().getElementsByTagName("dependencies").item(0).apply {
                        Artifact.values().forEach { module ->
                            if (module.nativeBinding != null) {
                                module.nativeBinding.platforms.forEach { appendBOM(it, module) }
                            } else {
                                appendBOM(null, module)
                            }
                        }
                    }
                }

                // Workaround for https://github.com/gradle/gradle/issues/7529
                asNode()
            }
        }
    }
}

// You have to add `OSSRH_USERNAME`, `OSSRH_PASSWORD`, `signing.keyId`,
// `signing.password` and `signing.secretKeyRingFile` to
// GRADLE_USER_HOME/gradle.properties
publishing.repositories {
    maven {
        name = "OSSRH"
        credentials {
            username = project.findProperty("OSSRH_USERNAME").toString()
            password = project.findProperty("OSSRH_PASSWORD").toString()
        }
        url = uri(
            if (projVersion.endsWith("-SNAPSHOT"))
                "https://s01.oss.sonatype.org/content/repositories/snapshots/"
            else "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
        )
    }
}

signing {
    if (!projVersion.endsWith("-SNAPSHOT") && System.getProperty("gpg.signing", "true").toBoolean())
        sign(publishing.publications)
}

dependencies {
    constraints {
        Artifact.values().forEach { api("io.github.over-run:${it.artifactName}:$projVersion") }
    }
}
