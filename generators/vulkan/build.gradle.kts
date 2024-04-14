/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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

val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject

tasks.register<JavaExec>("generate") {
    classpath(sourceSets["main"].runtimeClasspath)
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(jdkVersion))
    })
    if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    mainClass.set("overrungl.vulkan.VulkanGeneratorKt")
    workingDir = project(":vulkan").projectDir.resolve("src/main/java/overrungl/vulkan")
}
