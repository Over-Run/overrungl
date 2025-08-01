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
    id("me.champeau.jmh") version "0.7.3"
    id("module.conventions")
    id("submodule.conventions")
}

overrunglModule {
    artifactName = "overrungl-samples"
}

val jmhVersion: String by rootProject
val timerVersion: String by rootProject

dependencies {
    Artifact.entries.forEach {
        implementation(project(it.subprojectName))
    }
    implementation("io.github.over-run:timer:$timerVersion")
    jmh("org.openjdk.jmh:jmh-core:$jmhVersion")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:$jmhVersion")
}
