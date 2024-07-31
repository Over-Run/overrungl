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

enum class NativePlatform(
    val osFamilyName: String,
    val osArch: String,
    classifier: String = "$osFamilyName-$osArch",
    val nativeLibPrefix: String = "lib",
    val nativeLibSuffix: String = ".so"
) {
    FREEBSD_X64("freebsd", "x64", classifier = "freebsd"),
    LINUX_64("linux", "x64", classifier = "linux"),
    LINUX_ARM32("linux", "arm32"),
    LINUX_ARM64("linux", "arm64"),
    LINUX_PPC64LE("linux", "ppc64le"),
    LINUX_RISCV64("linux", "riscv64"),
    MACOS("macos", "x64", classifier = "macos", nativeLibSuffix = ".dylib"),
    MACOS_ARM64("macos", "arm64", nativeLibSuffix = ".dylib"),
    WIN_64("windows", "x64", classifier = "windows", nativeLibPrefix = "", nativeLibSuffix = ".dll"),
    WIN_ARM64("windows", "arm64", nativeLibPrefix = "", nativeLibSuffix = ".dll");

    val classifier = "natives-$classifier"
}

enum class NativeBinding(
    val bindingName: String,
    val basename: String,
    val platforms: List<NativePlatform>
) {
    GLFW("glfw", "glfw", NativePlatform.entries),
    NFD("nfd", "nfd", NativePlatform.entries),
    STB("stb", "stb", NativePlatform.entries)
}

enum class Artifact(
    val artifactName: String,
    val projectName: String,
    val projectDescription: String,
    val subprojectName: String,
    val nativeBinding: NativeBinding? = null
) {
    CORE(
        "overrungl", "OverrunGL",
        "The OverrunGL core library.",
        ":core"
    ),
    GLFW(
        "overrungl-glfw", "OverrunGL - GLFW bindings",
        "A multi-platform library for OpenGL, OpenGL ES and Vulkan development on the desktop. It provides a simple API for creating windows, contexts and surfaces, receiving input and events.",
        ":glfw", NativeBinding.GLFW
    ),
    JOML(
        "overrungl-joml", "OverrunGL - JOML native access",
        "A Java math library for OpenGL rendering calculations",
        ":joml"
    ),
    NFD(
        "overrungl-nfd", "OverrunGL - Native File Dialog",
        "A tiny, neat C library that portably invokes native file open and save dialogs.",
        ":nfd", NativeBinding.NFD
    ),
    OPENGL(
        "overrungl-opengl", "OverrunGL - OpenGL bindings",
        "The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms.",
        ":opengl"
    ),
    STB(
        "overrungl-stb", "OverrunGL - stb bindings",
        "Single-file public domain libraries for fonts, images, ogg vorbis files and more.",
        ":stb", NativeBinding.STB
    ),
//    VULKAN("overrungl-vulkan", "OverrunGL - Vulkan bindings",
//        "A new generation graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.",
//        ":vulkan", "Vulkan", null),
    ;

    fun nativeFileName(platform: NativePlatform): String? {
        return if (nativeBinding == null) null
        else "${nativeBinding.bindingName}/${platform.osFamilyName}-${platform.osArch}/${platform.nativeLibPrefix}${nativeBinding.basename}${platform.nativeLibSuffix}"
    }
}
