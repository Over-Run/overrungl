import org.jreleaser.model.Active
import java.time.LocalDate

/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

plugins {
    `java-platform`
    `maven-publish`
    id("org.jreleaser") version "1.18.0"
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
            skipTag = true
            skipRelease = true
            files = false
            artifacts = false
            checksums = false
            signatures = false
            catalogs = false
        }
    }
    deploy {
        maven {
            mavenCentral {
                create("sonatype") {
                    active = Active.ALWAYS
                    url = "https://central.sonatype.com/api/v1/publisher"
                    stagingRepository("build/staging-deploy")
                }
            }
        }
    }
}
