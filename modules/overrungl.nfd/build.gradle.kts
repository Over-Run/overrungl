plugins {
    id("module.conventions")
    id("submodule.conventions")
    id("native.conventions")
}

overrunglModule {
    artifactName = "overrungl-nfd"
    publishInfo = Artifact.NFD
    nativeBinding = NativeBinding.NFD
}
