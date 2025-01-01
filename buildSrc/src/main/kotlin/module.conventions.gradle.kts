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

import org.gradle.plugins.ide.idea.model.IdeaModel

plugins {
    `java-library`
    idea
}

val overrunglModule = extensions.create<OverrunGLModuleExtension>("overrunglModule")

val projGroupId: String by rootProject
val projName: String by rootProject
val projVersion: String by rootProject

val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject

val targetJavaVersion = jdkVersion.toInt()

val jetbrainsAnnotationsVersion: String by rootProject
val junitVersion: String by rootProject

group = projGroupId
version = projVersion

repositories {
    mavenCentral()
    // temporary maven repositories
    maven { url = uri("https://s01.oss.sonatype.org/content/repositories/snapshots") }
    maven { url = uri("https://s01.oss.sonatype.org/content/repositories/releases") }
}

dependencies {
    compileOnly("org.jetbrains:annotations:$jetbrainsAnnotationsVersion")
    testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    if (jdkEnablePreview.toBoolean()) options.compilerArgs.add("--enable-preview")
    options.release.set(targetJavaVersion)
}

tasks.withType<Test> {
    if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    useJUnitPlatform()
}

extensions.configure<JavaPluginExtension>("java") {
    toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))
    withJavadocJar()
    withSourcesJar()
}

tasks.named<Jar>("jar") {
    manifest.attributes(
        "Specification-Title" to projName,
        "Specification-Vendor" to "Overrun Organization",
        "Specification-Version" to projVersion.split('.', limit = 2)[0],
        "Implementation-Title" to projName,
        "Implementation-Vendor" to "Overrun Organization",
        "Implementation-Version" to projVersion
    )
    archiveBaseName.set(overrunglModule.artifactName)
    from(rootProject.file("LICENSE")) {
        rename { "${it}_${overrunglModule.artifactName.get()}" }
    }
}

tasks.named<Jar>("sourcesJar") {
    dependsOn(tasks["classes"])
    archiveBaseName.set(overrunglModule.artifactName)
    archiveClassifier.set("sources")
    from(sourceSets["main"].allSource)
}

tasks.named<Jar>("javadocJar") {
    val javadoc by tasks
    dependsOn(javadoc)
    archiveBaseName.set(overrunglModule.artifactName)
    archiveClassifier.set("javadoc")
    from(javadoc)
}

artifacts {
    add("archives", tasks["sourcesJar"])
    add("archives", tasks["javadocJar"])
}

the<IdeaModel>().module.inheritOutputDirs = true

afterEvaluate {
    overrunglModule.publishInfo.orNull?.also {
        rootProject.pluginManager.withPlugin("publishing") {
            rootProject.extensions.configure<PublishingExtension>("publishing") {
                publications {
                    create<MavenPublication>("maven${it.name}") {
                        groupId = projGroupId
                        artifactId = overrunglModule.artifactName.get()
                        version = projVersion
                        description = it.projectDescription
                        from(components["java"])
                        pom {
                            setupPom(it.projectName, it.projectDescription, "jar")
                        }
                    }
                    overrunglModule.nativeBinding.orNull?.platforms?.forEach { platform ->
                        getByName<MavenPublication>("overrunglBOM") {
                            pom {
                                withXml {
                                    asElement().getElementsByTagName("dependencyManagement").item(0).apply {
                                        asElement().getElementsByTagName("dependencies").item(0).apply {
                                            ownerDocument.createElement("dependency").also(::appendChild).apply {
                                                appendChild(ownerDocument.createElement("groupId")
                                                    .also(::appendChild)
                                                    .apply { textContent = projGroupId })
                                                appendChild(ownerDocument.createElement("artifactId")
                                                    .also(::appendChild)
                                                    .apply { textContent = overrunglModule.artifactName.get() })
                                                appendChild(ownerDocument.createElement("version")
                                                    .also(::appendChild)
                                                    .apply { textContent = projVersion })
                                                appendChild(ownerDocument.createElement("classifier")
                                                    .also(::appendChild)
                                                    .apply { textContent = platform.classifier })
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        rootProject.dependencies {
            constraints {
                api("io.github.over-run:${overrunglModule.artifactName.get()}:$projVersion")
            }
        }
    }
}
