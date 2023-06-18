# OverrunGL - Overrun Game Library

![License](https://img.shields.io/github/license/Over-Run/overrungl)
[![GitHub contributors](https://img.shields.io/github/contributors/Over-Run/overrungl)](https://github.com/Over-Run/overrungl/graphs/contributors)

![Maven Central](https://img.shields.io/maven-central/v/io.github.over-run/overrungl)
![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/io.github.over-run/overrungl?server=https%3A%2F%2Fs01.oss.sonatype.org%2F)

![GitHub repo size](https://img.shields.io/github/repo-size/Over-Run/overrungl)
[![Java CI with Gradle](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml/badge.svg?event=push)](https://github.com/Over-Run/overrungl/actions/workflows/gradle.yml)

## Introduction

Overrun Game Library is a high-performance library that implemented with Java 21,
enables cross-platform access to a set of C/C++ library bindings, and provides some useful utilities.

### OverrunGL vs. LWJGL

[LWJGL3](https://github.com/LWJGL/lwjgl3) is also a Java library that enables native access.

LWJGL3 uses JNI to access native functions, but OverrunGL uses [FFM API](https://openjdk.org/jeps/434), which has better
performance.

## Getting Started

You can check our [wiki](https://github.com/Over-Run/overrungl/wiki) or
the [samples](modules/samples/src/test/java/org/overrun/gl/demo).

## Using as a Dependency

~~The libraries are available on Maven Central.~~ Currently, we are developing with the first version, and it is very
unstable, so you have to use the -SNAPSHOT version.

You can import with `io.github.over-run:overrungl-bom:{the version}` and other submodules.

We will provide a module customizer soon.

### Using -SNAPSHOT Versions

We publish `-SNAPSHOT` versions frequently.

For `-SNAPSHOT` versions, you can use
the [list of available versions](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/over-run/overrungl/maven-metadata.xml)
and include this maven repository:

```groovy
maven { url "https://s01.oss.sonatype.org/content/repositories/snapshots" }
```

## Supported Bindings

Basic graphics:

| Module | Functionality                         |
|--------|---------------------------------------|
| GLFW   | Full (Core and native)                |
| OpenGL | Partial (Core and partial extensions) |
| STB    | Partial (Image, perlin noise)         |

Utilities:

| Module | Functionality            |
|--------|--------------------------|
| JOML   | Full (Vector and Matrix) |


## Contact

- [Discussions](https://github.com/Over-Run/overrungl/discussions)
- [Discord: ![Discord](https://img.shields.io/discord/1048545705553313862)](https://discord.gg/UKRJapDKgX)

## Release Notes

See [doc/notes](doc/notes/README.md).

## Additional

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
│  ├─ os x
│  │  ├─ arm64
│  │  │  └─ libglfw3.dylib
│  │  └─ x64
│  │     └─ libglfw3.dylib
│  └─ windows
│     └─ x64
│        └─ glfw3.dll
└─ stb https://github.com/Over-Run/stb-ci
   ├─ linux
   │  ├─ arm32
   │  │  └─ libstb.so
   │  ├─ arm64
   │  │  └─ libstb.so
   │  └─ x64
   │     └─ libstb.so
   ├─ os x
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
