import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

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

plugins { kotlin("jvm") version "2.0.0" }

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    val javaToolchains: JavaToolchainService by extensions
    val jdkVersion: String by rootProject
    val kotlinTargetJdkVersion: String by rootProject

    repositories { mavenCentral() }

    tasks.withType<KotlinCompile> {
        compilerOptions { jvmTarget.set(JvmTarget.fromTarget(kotlinTargetJdkVersion)) }
    }

    tasks.withType<JavaCompile> {
        javaCompiler.set(javaToolchains.compilerFor {
            targetCompatibility = kotlinTargetJdkVersion
            languageVersion.set(JavaLanguageVersion.of(jdkVersion))
        })
    }
}

subprojects {
    val implementation by configurations

    dependencies {
        implementation(project(":generators"))
    }
}
