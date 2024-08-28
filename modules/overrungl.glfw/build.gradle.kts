plugins {
    id("module.conventions")
    id("submodule.conventions")
    id("native.conventions")
}

overrunglModule {
    artifactName = "overrungl-glfw"
    publishInfo = Artifact.GLFW
    nativeBinding = NativeBinding.GLFW
}
