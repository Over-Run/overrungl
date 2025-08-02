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
    java
}

val overrunPlatformVersion: String by rootProject
val graalvmVersion: String by rootProject
val jomlVersion: String by rootProject
val jspecifyVersion: String by rootProject

val jdkVersion: String by rootProject
val targetJavaVersion = jdkVersion.toInt()

val projectsToDoc = Artifact.entries.map { rootProject.project(it.subprojectName) }

abstract class InstrumentedJarsRule : AttributeCompatibilityRule<LibraryElements> {
    override fun execute(details: CompatibilityCheckDetails<LibraryElements>) = details.run {
        if (consumerValue?.name == "instrumented-jar" && producerValue?.name == "jar") {
            compatible()
        }
    }
}

configurations {
    create("instrumentedApi") {
        isCanBeConsumed = false
        isCanBeResolved = true
        attributes {
            attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage.JAVA_API))
            attribute(LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE, objects.named("instrumented-jar"))
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    attributesSchema {
        attribute(LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE) {
            compatibilityRules.add(InstrumentedJarsRule::class.java)
        }
    }
    val instrumentedApi by configurations
    projectsToDoc.forEach { instrumentedApi(it) }
    instrumentedApi("io.github.over-run:platform:${overrunPlatformVersion}")
    instrumentedApi("org.graalvm.sdk:nativeimage:${graalvmVersion}")
    instrumentedApi("org.joml:joml:${jomlVersion}")
    instrumentedApi("org.jspecify:jspecify:${jspecifyVersion}")
}

tasks.register("assembleJavadocArgs") {
    group = "build"
    val mspFile = Path("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args")
    outputs.file(mspFile)

    val rootPath = rootProject.projectDir.path
    doLast {
        Files.deleteIfExists(mspFile)

        Files.writeString(
            mspFile, """
            --module-source-path
            $rootPath/modules/*/src/main/java${File.pathSeparator}$rootPath/modules/*/src/main/generated
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
    dependsOn(projectsToDoc.map { it.getTasksByName("classes", true) })
    source(projectsToDoc.map { it.sourceSets["main"].allJava })
    destinationDir = File("${rootProject.layout.buildDirectory.get().asFile}/docs/javadoc")

    classpath = configurations["instrumentedApi"]

//    executable = project.findProperty("javadocExecutable") as String?

    options.optionFiles = listOf(File("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args"))
}
