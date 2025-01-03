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

import java.nio.file.Files
import kotlin.io.path.Path

plugins {
    id("module.conventions")
}

overrunglModule {
    artifactName = "overrungl"
    publishInfo = Artifact.CORE
}

val overrunPlatformVersion: String by rootProject

val jdkVersion: String by rootProject
val targetJavaVersion = jdkVersion.toInt()

dependencies {
    api("io.github.over-run:platform:$overrunPlatformVersion")
}

tasks.register("assembleJavadocArgs") {
    group = "build"
    val mspFile = Path("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args")
    outputs.file(mspFile)

    doLast {
        Files.deleteIfExists(mspFile)

        Files.writeString(
            mspFile, """
            --module-source-path
            ${rootProject.projectDir.path}/modules/*/src/main/java
        """.trimIndent()
        )
    }
}

tasks.register<Javadoc>("aggregateJavadoc") {
    javadocTool = javaToolchains.javadocToolFor {
        languageVersion = JavaLanguageVersion.of(targetJavaVersion)
    }
    dependsOn(tasks["assembleJavadocArgs"])
    group = "documentation"
    outputs.upToDateWhen { false }
    val projectsToDoc = Artifact.values().map { rootProject.project(it.subprojectName) }
    dependsOn(projectsToDoc.map { it.getTasksByName("classes", true) })
    source(projectsToDoc.map { it.sourceSets["main"].java })
    setDestinationDir(File("${rootProject.layout.buildDirectory.get().asFile}/docs/javadoc"))

    classpath = files(projectsToDoc.map { it.configurations["compileClasspath"].files })

//    executable = project.findProperty("javadocExecutable") as String?

    options.optionFiles = listOf(File("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args"))
}
