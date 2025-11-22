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

enum class NativePlatform(
    val osFamilyName: String,
    val osArch: String,
    val nativeLibPrefix: String = "lib",
    val nativeLibSuffix: String = ".so"
) {
    FREEBSD_X64("freebsd", "x64"),
    LINUX_64("linux", "x64"),
    LINUX_ARM32("linux", "arm32"),
    LINUX_ARM64("linux", "arm64"),
    LINUX_PPC64LE("linux", "ppc64le"),
    LINUX_RISCV64("linux", "riscv64"),
    MACOS("macos", "x64", nativeLibSuffix = ".dylib"),
    MACOS_ARM64("macos", "arm64", nativeLibSuffix = ".dylib"),
    WIN_64("windows", "x64", nativeLibPrefix = "", nativeLibSuffix = ".dll"),
    WIN_ARM64("windows", "arm64", nativeLibPrefix = "", nativeLibSuffix = ".dll");

    val classifier = "natives-$osFamilyName-$osArch"
}

enum class NativeBinding(
    val bindingName: String,
    val basename: String,
    val repo: String,
    val platforms: List<NativePlatform> = NativePlatform.entries
) {
    GLFW("glfw", "glfw", "Over-Run/glfw-ci"),
    NFD("nfd", "nfd", "Over-Run/nfd-ci"),
    OPENAL("openal", "openal", "Over-Run/openal-ci"),
    SHADERC("shaderc", "shaderc_shared", "Over-Run/shaderc-ci"),
    STB("stb", "stb", "Over-Run/stb-ci"),
    TINYFD("tinyfd", "tinyfd", "Over-Run/tinyfd-ci"),
    VMA("vma", "VulkanMemoryAllocator", "Over-Run/VulkanMemoryAllocator-ci"),
}

enum class Artifact(
    val projectName: String,
    val projectDescription: String,
    val subprojectName: String
) {
    CORE(
        "OverrunGL",
        "The OverrunGL core library.",
        ":core"
    ),
    GLFW(
        "OverrunGL - GLFW bindings",
        "A multi-platform library for OpenGL, OpenGL ES and Vulkan development on the desktop. It provides a simple API for creating windows, contexts and surfaces, receiving input and events.",
        ":glfw"
    ),
    JOML(
        "OverrunGL - JOML native access",
        "A Java math library for OpenGL rendering calculations",
        ":joml"
    ),
    NFD(
        "OverrunGL - Native File Dialog bindings",
        "A tiny, neat C library that portably invokes native file open and save dialogs.",
        ":nfd"
    ),
    OPENAL(
        "OverrunGL - OpenAL bindings",
        "A cross-platform 3D audio API appropriate for use with gaming applications and many other types of audio applications.",
        ":openal"
    ),
    OPENGL(
        "OverrunGL - OpenGL bindings",
        "The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms.",
        ":opengl"
    ),
    SHADERC(
        "OverrunGL - Shaderc bindings",
        "A collection of tools, libraries, and tests for Vulkan shader compilation.",
        ":shaderc"
    ),
    STB(
        "OverrunGL - stb bindings",
        "Single-file public domain libraries for fonts, images, ogg vorbis files and more.",
        ":stb"
    ),
    TINYFD(
        "OverrunGL - tiny file dialogs bindings",
        "A native dialog library.",
        ":tinyfd"
    ),
    VMA(
        "OverrunGL - Vulkan Memory Allocator bindings",
        "Easy to integrate Vulkan memory allocation library.",
        ":vma"
    ),
    VULKAN(
        "OverrunGL - Vulkan bindings",
        "A new generation graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.",
        ":vulkan"
    ),
}

fun nativeFileName(nativeBinding: NativeBinding, platform: NativePlatform): String {
    return "${nativeBinding.bindingName}/${platform.osFamilyName}-${platform.osArch}/${platform.nativeLibPrefix}${nativeBinding.basename}${platform.nativeLibSuffix}"
}
