![License](https://img.shields.io/github/license/Over-Run/overrungl)

![Maven Central](https://img.shields.io/maven-central/v/io.github.over-run/overrungl)
![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/io.github.over-run/overrungl?server=https%3A%2F%2Fs01.oss.sonatype.org%2F)

![GitHub repo size](https://img.shields.io/github/repo-size/Over-Run/overrungl)

# OverrunGL - Overrun Game Library

Overrun Game Library is a high performance library that implemented with Java 19,
enables cross-platform access to a set of C/C++ library bindings, and provides some useful utilities.

## Using as a Dependency

~~The libraries are available on Maven Central.~~ Currently, we are developing with the first version, and it is very unstable, so you have to use the -SNAPSHOT version.

You can import with `io.github.over-run:overrungl-bom:{the version}` and other submodules.

We will provide a module customizer soon.

### Using -SNAPSHOT Versions

We publish `-SNAPSHOT` versions frequently.

For `-SNAPSHOT` versions, you can use the [list of available versions](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/over-run/overrungl/maven-metadata.xml) and include this maven repository:

```groovy
maven { url "https://s01.oss.sonatype.org/content/repositories/snapshots" }
```

## Contact

- [Forum](https://github.com/Over-Run/overrungl/discussions)
- [Discord: ![Discord](https://img.shields.io/discord/1048545705553313862)](https://discord.gg/UKRJapDKgX)

## Goals

Our goal is to support these libraries with full document:

- [x] [GLFW](https://www.glfw.org/) 3.3.8 (Currently 100%)
- [ ] [OpenGL](https://www.khronos.org/opengl/) 4.6 (Currently 39%)
- [ ] [STB](https://github.com/nothings/stb) (Currently 22%)
- [ ] [Vulkan](https://www.vulkan.org/) (Currently 0%)
- [ ] [OpenAL](https://www.openal.org/) (Currently 0%)

Checked item means it has full functional but might be not documented.

|                         Total Progress                         |
|:--------------------------------------------------------------:|
| ![total progress](https://progress-bar.dev/32/?title=progress) |

## Publishing (for internal member)

To publish this library, you need a GPG key and the write permission of Maven Central.

### Packing Natives

The build script can put the native libraries into jars.

The tree structure of libraries is:

```text
Natives
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
│     ├─ x64
│     │  └─ glfw3.dll
│     └─ x86
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
      ├─ x64
      │  └─ stb.dll
      └─ x86
         └─ stb.dll
```

## Additional

OpenGL docs can be found [here](https://docs.gl/).
