# Publishing

To publish this library, you need a GPG key and the write permission of Maven Central.

## CI

- [glfw](https://github.com/Over-Run/glfw-ci)
- [nfd](https://github.com/Over-Run/nfd-ci)
- [openal](https://github.com/Over-Run/openal-ci)
- [shaderc](https://github.com/Over-Run/shaderc-ci)
- [stb](https://github.com/Over-Run/stb-ci)
- [vma](https://github.com/Over-Run/VulkanMemoryAllocator-ci)

Use `gradlew downloadLatestNatives` to download files from these repositories.
You need to generate a GitHub token with `public_repo` permission
and specify `overrungl.github.release.token` in `GRADLE_USER_HOME/gradle.properites`.

## Packing Natives

The build script packs the native libraries into jars.

The tree structure of the native libraries is:

```text
natives
└─ <module-name>
   ├─ freebsd-x64
   │  └─ lib<basename>.so
   ├─ linux-arm32
   │  └─ lib<basename>.so
   ├─ linux-arm64
   │  └─ lib<basename>.so
   ├─ linux-ppc64le
   │  └─ lib<basename>.so
   ├─ linux-riscv64
   │  └─ lib<basename>.so
   ├─ linux-x64
   │  └─ lib<basename>.so
   ├─ macos-arm64
   │  └─ lib<basename>.dylib
   ├─ macos-x64
   │  └─ lib<basename>.dylib
   ├─ windows-arm64
   │  └─ <basename>.dll
   └─ windows-x64
      └─ <basename>.dll
```

The `natives` directory is in the root project directory.
