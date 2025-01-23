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

import overrungl.gen.file.*
import overrungl.gen.writeNativeImageRegistration

const val glfwPackage = "overrungl.glfw"
const val glfwLookup = "GLFWInternal.lookup()"

fun main() {
    registerDefType(
        "GLFWboolean",
        CustomDefType(
            "int",
            "boolean",
            c_int.memoryLayout,
            object : DefTypeProcessor {
                override fun processDowncall(originalValue: String): String =
                    "(($originalValue) ? GLFW.GLFW_TRUE : GLFW.GLFW_FALSE)"

                override fun processUpcall(originalValue: String): String {
                    return "(($originalValue) != GLFW.GLFW_FALSE)"
                }
            }
        ))
    DefinitionFile("glfw3.gen").compile(glfwPackage, "GLFW", glfwLookup)
    DefinitionFile("glfw3native.gen").compile(glfwPackage, "GLFWNative", glfwLookup)

    writeNativeImageRegistration(glfwPackage)
}
