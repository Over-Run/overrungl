# OverrunGL - Overrun Game Library

![License](https://img.shields.io/github/license/Over-Run/overrungl)

[//]: # (![Maven Central]&#40;https://img.shields.io/maven-central/v/io.github.over-run/overrungl&#41;)
![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/io.github.over-run/overrungl?server=https%3A%2F%2Fs01.oss.sonatype.org)

[![Java CI with Gradle](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml/badge.svg?event=push)](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml)
[![OpenSSF Best Practices](https://www.bestpractices.dev/projects/8279/badge)](https://www.bestpractices.dev/projects/8279)

## Introduction

Overrun Game Library is a high-performance library implemented with Java 23,
which enables cross-platform access to a set of C/C++ library bindings, providing various useful utilities.

### Comparing with LWJGL 3

[LWJGL 3](https://github.com/LWJGL/lwjgl3) is also a Java library that enables cross-platform access.

LWJGL 3 uses JNI to access native functions, in OverrunGL, however,
the [FFM API](https://openjdk.org/jeps/454) is used, which makes the linking to native functions more convenient
as well as providing better memory management.

## Getting Started

You can check our [wiki](https://github.com/Over-Run/overrungl/wiki) or
the [samples](modules/samples/src/main/java/overrungl/demo).

Check [discussions](https://github.com/Over-Run/overrungl/discussions) in case you have trouble in setup works, such as environment configuring.

Feel free to ask questions as long as you have searched in discussions and found no one had the same question.

## Import as a Dependency

We provided a modules customizer [here](https://over-run.github.io/overrungl-gen/).
A documentation of the customizer is [here](doc/customizer/doc_on_customizer.md).

- Platform Maven coordinate: `io.github.over-run:overrungl-bom`
- Core module Maven coordinate: `io.github.over-run:overrungl`
- For others: `io.github.over-run:overrungl-<module-name>`

Currently, OverrunGL uses preview features preventing users from using newer JDKs,
so only `-SNAPSHOT` versions are provided at this time.

### Using -SNAPSHOT Versions

We publish `-SNAPSHOT` versions frequently.

For `-SNAPSHOT` versions, you can check
the [list of available versions](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/over-run/overrungl/maven-metadata.xml)
and include this maven repository:

```kotlin
repositories {
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
}
```

### Enable native access

You must enable the access to restricted methods by adding a VM argument or a manifest attribute.
The customizer has already included this.

```
--enable-native-access=overrungl.core,...
```

## List of Supported Bindings

### Khronos APIs

| Library                                   | Description                                                                                                                                 |
|-------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------|
| [OpenGL](https://www.khronos.org/opengl/) | The most widely adopted 2D and 3D graphics API in the industry, bringing thousands of applications to a wide variety of computer platforms. |

### Display and Input

| Library                                                                          | Description                                                                                                                                                                                                                                |
|----------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [GLFW](http://www.glfw.org/)                                                     | Create multiple windows, handle user input (keyboard, mouse, gaming peripherals) and manage contexts. Also features multi-monitor support, clipboard access, file drag-n-drop, and [much more](http://www.glfw.org/docs/latest/news.html). |
| [Native File Dialog Extended](https://github.com/btzy/nativefiledialog-extended) | A small C library that portably invokes native file open, folder select and file save dialogs.                                                                                                                                             |

### [stb](https://github.com/nothings/stb) - single-file public domain libraries for C/C++

| Library          | Description                                                                     |
|------------------|---------------------------------------------------------------------------------|
| stb_easy_font    | Quick-and-dirty easy-to-deploy bitmap font for printing frame rate, etc.        |
| stb_image        | Image loading/decoding from file/memory: JPG, PNG, TGA, BMP, PSD, GIF, HDR, PIC |
| stb_image_resize | Resize images larger/smaller with good quality.                                 |
| stb_image_write  | Image writing to disk: PNG, TGA, BMP                                            |
| stb_perlin       | Revised Perlin noise (3D input, 1D output).                                     |
| stb_rect_pack    | Simple 2D rectangle packer with decent quality.                                 |
| stb_truetype     | Parse, decode, and rasterize characters from truetype fonts.                    |
| stb_vorbis       | Decode ogg vorbis files from file/memory to float/16-bit signed output.         |

### Other

| Library                                 | Description                                           |
|-----------------------------------------|-------------------------------------------------------|
| [JOML](https://github.com/JOML-CI/JOML) | A Java math library for OpenGL rendering calculations |

## Release Notes

See [doc/notes](doc/notes/README.md).

## Additional

The latest Javadoc can be found [here](https://over-run.github.io/overrungl/).

The documentation of OpenGL can be found from [Khronos' references](https://registry.khronos.org/OpenGL-Refpages/gl4/) and [docs.gl](https://docs.gl/).

OverrunGL uses [Marshal](https://github.com/Over-Run/marshal).

[JavaPoet](https://github.com/palantir/javapoet) is used to generate source files.

### Credits

[<img src="https://resources.jetbrains.com/storage/products/company/brand/logos/jb_beam.png" alt="JetBrains Logo (Main) logo." width="128" height="128">](https://jb.gg/OpenSourceSupport)
