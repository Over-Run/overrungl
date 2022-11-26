# OverrunGL

![License](https://img.shields.io/github/license/Over-Run/overrungl)

![Maven Central](https://img.shields.io/maven-central/v/io.github.over-run/overrungl)
![Sonatype Nexus (Snapshots)](https://img.shields.io/nexus/s/io.github.over-run/overrungl?server=https%3A%2F%2Fs01.oss.sonatype.org%2F)

Overrun Game Library is a set of C/C++ library bindings and native accessor.

## Using as a Dependency

The libraries are available on Maven Central.

You can import with `io.github.over-run:overrungl-bom:{the version}` and other submodules.

### Using -SNAPSHOT Versions

We publish `-SNAPSHOT` versions frequently.

For `-SNAPSHOT` versions, you can use the [list of available versions](https://s01.oss.sonatype.org/content/repositories/snapshots/io/github/over-run/overrungl/maven-metadata.xml) and include this maven repository:

```groovy
maven { url "https://s01.oss.sonatype.org/content/repositories/snapshots" }
```

## Goals

Our goal is to support these libraries with full document:

- [x] [GLFW](https://www.glfw.org/) 3.3.8 (Currently 100%)
- [ ] [OpenGL](https://www.khronos.org/opengl/) 4.6 (Currently 38%)
- [ ] [STB](https://github.com/nothings/stb) (Currently 22%)
- [ ] [Vulkan](https://www.vulkan.org/) (Currently 0%)
- [ ] [OpenAL](https://www.openal.org/) (Currently 0%)

Checked item means it has full functional but might be not documented.

|                         Total Progress                         |
|:--------------------------------------------------------------:|
| ![total progress](https://progress-bar.dev/32/?title=progress) |

## Publishing

To publish this library, you need a GPG key and the write permission of Maven Central.

### Packing Natives

The build script can put the native libraries into jars.

The tree structure of libraries is:

```text
Natives
├─ glfw
│  ├─ os x
│  │  ├─ amd64
│  │  │  └─ libglfw3.dylib
│  │  └─ arm64
│  │     └─ libglfw3.dylib
│  └─ windows
│     ├─ amd64
│     │  └─ glfw3.dll
│     └─ i386
│        └─ glfw3.dll
└─ stb https://github.com/Over-Run/stb-ci
   ├─ os x
   │  └─ amd64
   │     └─ libstb.dylib
   └─ windows
      ├─ amd64
      │  └─ stb.dll
      ├─ arm64
      │  └─ stb.dll
      └─ i386
         └─ stb.dll
```

## Additional

OpenGL docs can be found [here](https://docs.gl/).
