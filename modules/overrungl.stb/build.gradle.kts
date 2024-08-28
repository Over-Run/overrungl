plugins {
    id("module.conventions")
    id("submodule.conventions")
    id("native.conventions")
}

overrunglModule {
    artifactName = "overrungl-stb"
    publishInfo = Artifact.STB
    nativeBinding = NativeBinding.STB
}
