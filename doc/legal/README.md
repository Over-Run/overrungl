We redistributed code from these libraries:

## Gradle

[Repository](https://github.com/gradle/gradle)

[LICENSE](LICENSE_gradle)

Files:

- subprojects/base-services/src/main/java/org/gradle/internal/os/OperatingSystem.java -> [modules/overrungl.core/src/main/java/overrungl/os/OperatingSystem.java](../../modules/overrungl.core/src/main/java/overrungl/os/OperatingSystem.java)

## LWJGL 3

[Repository](https://github.com/LWJGL/lwjgl3)

[LICENSE.md](LICENSE_lwjgl3.md)

Files:

- modules/lwjgl/core/src/main/java/org/lwjgl/system/MemoryManage.java -> [modules/overrungl.core/src/main/java/overrungl/util/DebugAllocator.java](../../modules/overrungl.core/src/main/java/overrungl/util/DebugAllocator.java)
- modules/lwjgl/core/src/main/java/org/lwjgl/system/MemoryStack.java -> [modules/overrungl.core/src/main/java/overrungl/util/MemoryStack.java](../../modules/overrungl.core/src/main/java/overrungl/util/MemoryStack.java)
- modules/lwjgl/core/src/main/java9/org/lwjgl/system/StackWalkUtil.java -> [modules/overrungl.core/src/main/java/overrungl/util/StackWalkUtil.java](../../modules/overrungl.core/src/main/java/overrungl/util/StackWalkUtil.java)
- modules/samples/src/test/java/org/lwjgl/demo/util/IOUtil.java -> [modules/samples/src/test/java/overrungl/demo/util/IOUtil.java](../../modules/samples/src/test/java/overrungl/demo/util/IOUtil.java)
