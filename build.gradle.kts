plugins {
    `java-platform`
    `maven-publish`
    signing
}

val projGroupId: String by rootProject
val projVersion: String by rootProject
val projLicenseYear: String by rootProject

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

                    links(
                        "https://over-run.github.io/memstack/",
                        "https://over-run.github.io/marshal/"
                    )

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
                        """<a href="https://github.com/Over-Run/overrungl/issues">Report a bug or suggest an enhancement</a><br>""" +
                            "Copyright © $projLicenseYear Overrun Organization<br>" +
                            "<b>$projVersion (env ${Runtime.version()})</b>"
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
