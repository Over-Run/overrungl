# OverrunGL

Overrun Game Library is a set of C/C++ library bindings and native accessor.

## Goals

Our goal is to support these libraries with full document:

- [x] [GLFW](https://www.glfw.org/) 3.3.8 (Currently 100%)
- [ ] [OpenGL](https://www.khronos.org/opengl/) 4.6 (Currently 38%)
- [ ] [STB](https://github.com/nothings/stb) (Currently 22%)
- [ ] [Vulkan](https://www.vulkan.org/) (Currently 0%)
- [ ] [OpenAL](https://www.openal.org/) (Currently 0%)

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
