# OverrunGL - Overrun Game Library

![Release version](https://img.shields.io/maven-central/v/io.github.over-run/overrungl?label=release&color=blue)
![Snapshot version](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Fcentral.sonatype.com%2Frepository%2Fmaven-snapshots%2Fio%2Fgithub%2Fover-run%2Foverrungl%2Fmaven-metadata.xml&label=snapshot)

[![Java CI with Gradle](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml/badge.svg?event=push)](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml)
<!--[![OpenSSF Best Practices](https://www.bestpractices.dev/projects/8279/badge)](https://www.bestpractices.dev/projects/8279)-->

## Overview

[//]: # (TODO: new API)

```java
void main() {
    // use MemorySegment to represent memory addresses
    MemorySegment window = glfwCreateWindow(
        800, 600,
        // use MemoryUtil::allocString to allocate string and manage by GC
        MemoryUtil.allocString("Title"),
        MemorySegment.NULL,
        MemorySegment.NULL
    );

    int width, height;
    // use Arena to allocate off-heap memory
    try (var arena = Arena.ofConfined()) {
        // use ValueLayout to represent memory layout
        var pWidth = arena.allocate(ValueLayout.JAVA_INT);
        var pHeight = arena.allocate(ValueLayout.JAVA_INT);

        glfwGetFramebufferSize(window, pWidth, pHeight);

        width = pWidth.get(ValueLayout.JAVA_INT, 0);
        height = pHeight.get(ValueLayout.JAVA_INT, 0);
    }

    // for OpenGL, create instance of wrappers
    var gl = new GL(GLFW::glfwGetProcAddress);
    // invoke OpenGL functions via instance methods
    gl.ClearColor(0.0f, 0.0f, 0.0f, 1.0f);
}
```

## Introduction

Overrun Game Library is a high-performance library implemented with Java 25,
which enables cross-platform access to a set of C library bindings, providing various useful utilities.

### Comparing with LWJGL 3

[LWJGL 3](https://github.com/LWJGL/lwjgl3) is also a Java library that enables cross-platform access.

LWJGL 3.4.0 still uses JNI-style APIs, but delegates to the FFM backend when on JDK 25 or later.
OverrunGL provides FFM-style APIs, where raw pointers are represented as `MemorySegment`.

## Getting Started

You can check the [wiki](https://github.com/Over-Run/overrungl/wiki) or
the [samples](modules/samples/src/test/java/overrungl/demo).

Feel free to ask questions in [discussions](https://github.com/Over-Run/overrungl/discussions) in case you have trouble in setup works, such as environment configuring.

## Import as a Dependency

The [modules customizer](https://over-run.github.io/overrungl-gen/) is the recommended way to generate dependency declarations.

Maven coordinates for your information:

- Maven coordinate of Bill of Materials: `io.github.over-run:overrungl-bom`
- Maven coordinate of core module: `io.github.over-run:overrungl`
- Others: `io.github.over-run:overrungl-<module-name>`

For example:

```kotlin
dependencies {
    implementation(platform("io.github.over-run:overrungl-bom:<VERSION>"))
    implementation("io.github.over-run:overrungl")
    implementation("io.github.over-run:overrungl-glfw")
    implementation(platform("org.lwjgl:lwjgl-bom:<VERSION>"))
    runtimeOnly("org.lwjgl:lwjgl-glfw::natives-<OS>-<ARCH>")
}
```

### Using -SNAPSHOT Versions

We publish `-SNAPSHOT` versions frequently.
You can check the [list of available versions](https://central.sonatype.com/repository/maven-snapshots/io/github/over-run/overrungl/maven-metadata.xml).

Add this maven repository to use snapshot versions:

```kotlin
repositories {
    maven("https://central.sonatype.com/repository/maven-snapshots")
}
```

### Enable native access

The access to restricted methods must be enabled by adding a VM argument or a manifest attribute.
The customizer can generate a list of modules to be enabled access.

```
--enable-native-access=overrungl.core,...
```

## List of Supported Bindings

### Khronos APIs

| Library                                   | Description                                                                                                                                                                                                    |
|-------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [OpenGL](https://www.khronos.org/opengl/) | The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms.                                                                    |
| [Vulkan](https://www.khronos.org/vulkan/) | A new generation graphics and compute API that provides high-efficiency, cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms. |

### Display and Input

| Library                                                                          | Description                                                                                         |
|----------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------|
| [GLFW](http://www.glfw.org/)                                                     | GLFW provides a simple API for creating windows, contexts and surfaces, receiving input and events. |
| [Native File Dialog Extended](https://github.com/btzy/nativefiledialog-extended) | A small C library that portably invokes native file open, folder select and file save dialogs.      |
| [tinyfd](https://sourceforge.net/projects/tinyfiledialogs/)                      | A native dialog library.                                                                            |

### Audio

| Library                                 | Description                                                                                                            |
|-----------------------------------------|------------------------------------------------------------------------------------------------------------------------|
| [OpenAL](https://www.openal.org/)       | A cross-platform 3D audio API appropriate for use with gaming applications and many other types of audio applications. |
| [OpenAL Soft](https://openal-soft.org/) | An LGPL-licensed, cross-platform, software implementation of the OpenAL 3D audio API.                                  |

### Graphics

| Library                                                                                      | Description                                                                |
|----------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|
| [Shaderc](https://github.com/google/shaderc)                                                 | A collection of tools, libraries, and tests for Vulkan shader compilation. |
| [Vulkan Memory Allocator](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator) | Easy to integrate Vulkan memory allocation library                         |

### [stb](https://github.com/nothings/stb) - single-file public domain libraries for C/C++

| Library           | Description                                                                     |
|-------------------|---------------------------------------------------------------------------------|
| stb_easy_font     | Quick-and-dirty easy-to-deploy bitmap font for printing frame rate, etc.        |
| stb_image         | Image loading/decoding from file/memory: JPG, PNG, TGA, BMP, PSD, GIF, HDR, PIC |
| stb_image_resize2 | Resize images larger/smaller with good quality.                                 |
| stb_image_write   | Image writing to disk: PNG, TGA, BMP                                            |
| stb_perlin        | Revised Perlin noise (3D input, 1D output).                                     |
| stb_rect_pack     | Simple 2D rectangle packer with decent quality.                                 |
| stb_truetype      | Parse, decode, and rasterize characters from truetype fonts.                    |
| stb_vorbis        | Decode ogg vorbis files from file/memory to float/16-bit signed output.         |

### Other

| Library                                 | Description                                           |
|-----------------------------------------|-------------------------------------------------------|
| [JOML](https://github.com/JOML-CI/JOML) | A Java math library for OpenGL rendering calculations |

## Release Notes

See [doc/notes](doc/notes/README.md).

## Additions

The latest Javadoc can be found [here](https://over-run.github.io/overrungl/).

[//]: # (### Credits)

[//]: # ([<img src="https://resources.jetbrains.com/storage/products/company/brand/logos/jb_beam.png" alt="JetBrains Logo &#40;Main&#41; logo." width="128" height="128">]&#40;https://jb.gg/OpenSourceSupport&#41;)
