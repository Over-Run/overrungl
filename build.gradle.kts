
import org.gradle.plugins.ide.idea.model.IdeaModel

plugins {
    `java-platform`
    `maven-publish`
    signing
}

val projGroupId: String by project
val projArtifactId: String by project
val projName: String by project
val projVersion: String by project
val projVcs: String by project
val projBranch: String by project
val projLicenseYear: String by project
val projLicenseFileName: String by project
val orgName: String by project
val orgUrl: String by project

val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject
val jdkEarlyAccessDoc: String? by rootProject
val kotlinTargetJdkVersion: String by rootProject

val targetJavaVersion = jdkVersion.toInt()

group = projGroupId
version = projVersion

val artifactNameMap = buildMap {
    Artifact.values().forEach { put(it.subprojectName, it.artifactName) }
    put(":samples", "overrungl-samples")
}

artifactNameMap.forEach { (subprojectName, artifactName) ->
    project(subprojectName) {
        apply(plugin = "java-library")
        apply(plugin = "idea")

        group = projGroupId
        version = projVersion

        repositories {
            mavenCentral()
            // temporary maven repositories
            maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots") }
            maven { url = uri("https://s01.oss.sonatype.org/content/repositories/releases") }
        }

        val compileOnly by configurations
        dependencies {
            compileOnly("org.jetbrains:annotations:24.1.0")
            if (project.name != "core") {
                compileOnly(project(Artifact.CORE.subprojectName))
                constraints { api("io.github.over-run:overrungl:$projVersion") }
            }
        }

        tasks.withType<JavaCompile> {
            options.encoding = "UTF-8"
            if (jdkEnablePreview.toBoolean()) options.compilerArgs.add("--enable-preview")
            options.release.set(targetJavaVersion)
        }

        tasks.withType<Test> {
            if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
        }

        extensions.configure<JavaPluginExtension>("java") {
            toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))
            withJavadocJar()
            withSourcesJar()
        }

        tasks.named<Jar>("jar") {
            manifestContentCharset = "utf-8"
            setMetadataCharset("utf-8")
            manifest.attributes(
                "Specification-Title" to projName,
                "Specification-Vendor" to "Overrun Organization",
                "Specification-Version" to projVersion.split('.', limit = 2)[0],
                "Implementation-Title" to projName,
                "Implementation-Vendor" to "Overrun Organization",
                "Implementation-Version" to projVersion
            )
            archiveBaseName.set(artifactName)
            from(rootProject.file(projLicenseFileName)).rename(
                projLicenseFileName,
                "${projLicenseFileName}_$artifactName"
            )
        }

        tasks.named<Jar>("sourcesJar") {
            dependsOn(tasks["classes"])
            archiveBaseName.set(artifactName)
            archiveClassifier.set("sources")
            from(sourceSets["main"].allSource)
        }

        tasks.named<Jar>("javadocJar") {
            val javadoc by tasks
            dependsOn(javadoc)
            archiveBaseName.set(artifactName)
            archiveClassifier.set("javadoc")
            from(javadoc)
        }

        artifacts {
            archives(tasks["sourcesJar"])
            archives(tasks["javadocJar"])
        }

        the<IdeaModel>().module.inheritOutputDirs = true
    }
}

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

                    bottom =
                        "<a href=\"https://github.com/Over-Run/overrungl/issues\">Report a bug or suggest an enhancement</a><br>" +
                            "Copyright © 2022-$projLicenseYear Overrun Organization<br>" +
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
        developers {
            developer {
                id = "squid233"
                url = "https://github.com/squid233"
                organization = orgName
                organizationUrl = orgUrl
            }
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
                from(components["java"])
            }
            module.nativeBinding?.platforms?.forEach {
                val nativeName = module.nativeFileName(it)!!
                val file = File("${rootProject.projectDir}/natives/$nativeName")
                if (file.exists()) {
                    val nativeParent = File(nativeName).parent
                    artifact(tasks.register<Jar>("nativeJar${module.mavenName}${it.taskSuffix}") {
                        archiveBaseName.set(module.artifactName)
                        archiveClassifier.set(it.classifier)
                        from(file) { into(nativeParent) }
                    })
                }
            }
            pom {
                setupPom(module.projectName, module.projectDescription, "jar")
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
                                module.nativeBinding!!.platforms.forEach { appendBOM(it, module) }
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
    mavenLocal()
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
