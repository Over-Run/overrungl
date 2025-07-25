/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

package overrungl.glfw

import overrungl.gen.file.DefinitionFile
import overrungl.gen.file.int_boolean
import overrungl.gen.file.registerDefType
import overrungl.gen.generateLookupAccessor
import overrungl.gen.writeNativeImageRegistration

const val glfwPackage = "overrungl.glfw"
const val glfwLookup = "GLFWLibrary.lookup()"

fun main() {
    registerDefType("GLFWboolean", int_boolean)
    DefinitionFile("glfw3.gen").compile(glfwPackage, "GLFW", glfwLookup)
    DefinitionFile("glfw3native.gen").compile(glfwPackage, "GLFWNative", glfwLookup)

    writeNativeImageRegistration(glfwPackage)
    generateLookupAccessor(
        packageName = "glfw",
        className = "GLFWLibrary",
        moduleName = "glfw",
        basename = "glfw",
        versionRef = "GLFW_VERSION"
    )
}
