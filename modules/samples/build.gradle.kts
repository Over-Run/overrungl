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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
val lwjglVersion: String by rootProject
val lwjglNatives: String by rootProject

dependencies {
    Artifact.entries.forEach { artifact ->
        implementation(project(artifact.subprojectName))
        runtimeOnly(project.project(artifact.subprojectName).overrunglModule.lwjglArtifactName.map {
            if (it == "lwjgl-vulkan" && lwjglNatives != "natives-macos" && lwjglNatives != "natives-macos-arm64") {
                return@map null
            }
            "org.lwjgl:$it:$lwjglVersion:$lwjglNatives"
        })
    }
    implementation("io.github.over-run:timer:$timerVersion")
    jmh("org.openjdk.jmh:jmh-core:$jmhVersion")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:$jmhVersion")
}
