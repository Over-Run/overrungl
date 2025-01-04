plugins {
    id("module.conventions")
    id("submodule.conventions")
}

overrunglModule {
    artifactName = "overrungl-joml"
    publishInfo = Artifact.JOML
}

val jomlVersion: String by rootProject

dependencies {
    api("org.joml:joml:$jomlVersion")
}
