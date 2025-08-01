import org.gradle.api.tasks.JavaExec
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByName
import org.gradle.kotlin.dsl.provideDelegate

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

/**
 * @author squid233
 * @since 0.1.0
 */
abstract class GenerateTask : JavaExec() {
    private val jdkVersion: String by project
    private val jdkEnablePreview: String by project

    init {
        classpath(project.extensions.getByName<SourceSetContainer>("sourceSets")["main"].runtimeClasspath)
        javaLauncher.set(javaToolchainService.launcherFor {
            languageVersion.set(JavaLanguageVersion.of(jdkVersion))
        })
        if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    }
}
