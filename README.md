# OverrunGL

Overrun Game Library is a set of C/C++ library bindings.

## Goals

Our goal is to support these libraries with full document:

- [ ] [GLFW](https://www.glfw.org/) 3.3.8 (Currently 75%)
- [ ] [OpenGL](https://www.khronos.org/opengl/) 4.6 (Currently 34%)
- [ ] [STB](https://github.com/nothings/stb) (Currently 20%)

|                   Total Progress                   |
|:--------------------------------------------------:|
| <progress value="43" max="100"></progress> **43%** |

## Modules

The library loader first find shared library from jar
with path `moduleName/osFamilyName/osArch/basename.suffix` and extract it
to `${java.io.tmpdir}/overrungl${user.name}/basename-version.suffix`.
If shared not found in jar, find it in `${overrungl.natives}/basename.suffix`.

|      | Module Name | Basename | Version |
|------|-------------|----------|---------|
| GLFW | glfw        | glfw3    | 3.3.8   |
| STB  | stb         | stb      | 0.1.0   |

## Additional

OpenGL docs can be found [here](https://docs.gl/).
