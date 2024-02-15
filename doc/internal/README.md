# Internal Documentation

## Publishing

To publish this library, you need a GPG key and the write permission of Maven Central.

### Packing Natives

The build script packs the native libraries into jars.

The tree structure of the native libraries is:

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
├─ nfd https://github.com/Over-Run/nfd-ci
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

The `natives` directory is in the project directory.
