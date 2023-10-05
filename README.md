# OverrunGL - Overrun Game Library

![License](https://img.shields.io/github/license/Over-Run/overrungl)
[![GitHub contributors](https://img.shields.io/github/contributors/Over-Run/overrungl)](https://github.com/Over-Run/overrungl/graphs/contributors)

![Maven Central](https://img.shields.io/maven-central/v/io.github.over-run/overrungl)
![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/io.github.over-run/overrungl?server=https%3A%2F%2Fs01.oss.sonatype.org%2F)

![GitHub repo size](https://img.shields.io/github/repo-size/Over-Run/overrungl)
[![Java CI with Gradle](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml/badge.svg?event=push)](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml)

## Introduction

Overrun Game Library is a high-performance library implemented with Java 21,
enables cross-platform access to a set of C/C++ library bindings, and provides some useful utilities.

### OverrunGL vs. LWJGL

[LWJGL 3](https://github.com/LWJGL/lwjgl3) is also a Java library that enables native access.

LWJGL 3 uses JNI to access native functions,
but OverrunGL uses [FFM API](https://openjdk.org/jeps/442), which has better performance.

## Getting Started

You can check our [wiki](https://github.com/Over-Run/overrungl/wiki) or
the [samples](modules/samples/src/test/java/overrungl/demo).

## Using as a Dependency

~~The libraries are available on Maven Central.~~ Currently, we are developing with the first version, and it is very
unstable, so you have to use `-SNAPSHOT` version.

You can import with `io.github.over-run:overrungl-bom:{the version}` and other submodules.

We have provided an artifacts customizer [here](https://over-run.github.io/overrungl-gen/).

### Using -SNAPSHOT Versions

We publish `-SNAPSHOT` versions frequently.

For `-SNAPSHOT` versions, you can use
the [list of available versions](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/over-run/overrungl/maven-metadata.xml)
and include this maven repository:

```groovy
maven { url "https://s01.oss.sonatype.org/content/repositories/snapshots" }
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

### Audio

| Library                           | Description                                                                                                            |
|-----------------------------------|------------------------------------------------------------------------------------------------------------------------|
| [OpenAL](https://www.openal.org/) | A cross-platform 3D audio API appropriate for use with gaming applications and many other types of audio applications. |

### [stb](https://github.com/nothings/stb) - single-file public domain libraries for C/C++

| Library          | Description                                                                     |
|------------------|---------------------------------------------------------------------------------|
| stb_easy_font    | 	Quick-and-dirty easy-to-deploy bitmap font for printing frame rate, etc.       |
| stb_image        | Image loading/decoding from file/memory: JPG, PNG, TGA, BMP, PSD, GIF, HDR, PIC |
| stb_image_resize | Resize images larger/smaller with good quality.                                 |
| stb_image_write  | 	Image writing to disk: PNG, TGA, BMP                                           |
| stb_perlin       | Revised Perlin noise (3D input, 1D output).                                     |

### Other

| Library                                 | Description                                           |
|-----------------------------------------|-------------------------------------------------------|
| [JOML](https://github.com/JOML-CI/JOML) | A Java math library for OpenGL rendering calculations |

## Contact

- [Discussions](https://github.com/Over-Run/overrungl/discussions)
- [Discord: ![Discord](https://img.shields.io/discord/1048545705553313862)](https://discord.gg/UKRJapDKgX)

## Release Notes

See [doc/notes](doc/notes/README.md).

## Additional

Javadoc can be found [here](https://over-run.github.io/overrungl-doc/).

The documentation of OpenGL can be found [here](https://docs.gl/).

### Publishing (for internal member)

To publish this library, you need a GPG key and the write permission of Maven Central.

#### Packing Natives

The build script can put the native libraries into jars.

The tree structure of libraries is:

```text
natives
├─ glfw
│  ├─ linux
│  │  ├─ arm64
│  │  │  └─ libglfw3.so
│  │  └─ x64
│  │     └─ libglfw3.so
│  ├─ macos
│  │  ├─ arm64
│  │  │  └─ libglfw3.dylib
│  │  └─ x64
│  │     └─ libglfw3.dylib
│  └─ windows
│     └─ x64
│        └─ glfw3.dll
├─ nfd https://github.com/Over-Run/nativefiledialog-extended-ci
│  ├─ linux
│  │  ├─ arm32
│  │  │  └─ libnfd.so
│  │  ├─ arm64
│  │  │  └─ libnfd.so
│  │  └─ x64
│  │     └─ libnfd.so
│  ├─ macos
│  │  ├─ arm64
│  │  │  └─ libnfd.dylib
│  │  └─ x64
│  │     └─ libnfd.dylib
│  └─ windows
│     ├─ arm64
│     │  └─ nfd.dll
│     └─ x64
│        └─ nfd.dll
│─ openal https://github.com/Over-Run/openal-soft-ci
│  ├─ linux
│  │  ├─ arm32
│  │  │  └─ libopenal.so
│  │  ├─ arm64
│  │  │  └─ libopenal.so
│  │  └─ x64
│  │     └─ libopenal.so
│  ├─ macos
│  │  ├─ arm64
│  │  │  └─ libopenal.dylib
│  │  └─ x64
│  │     └─ libopenal.dylib
│  └─ windows
│     ├─ arm64
│     │  └─ openal.dll
│     └─ x64
│        └─ openal.dll
└─ stb https://github.com/Over-Run/stb-ci
   ├─ linux
   │  ├─ arm32
   │  │  └─ libstb.so
   │  ├─ arm64
   │  │  └─ libstb.so
   │  └─ x64
   │     └─ libstb.so
   ├─ macos
   │  ├─ arm64
   │  │  └─ libstb.dylib
   │  └─ x64
   │     └─ libstb.dylib
   └─ windows
      ├─ arm64
      │  └─ stb.dll
      └─ x64
         └─ stb.dll
```
