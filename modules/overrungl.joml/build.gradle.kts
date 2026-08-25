plugins {
    id("module.conventions")
    id("submodule.conventions")
}

overrunglModule {
    artifactName = "overrungl-joml"
    publishInfo = Artifact.JOML
}

val jomlVersion = rootProject.providers.gradleProperty("jomlVersion").get()

dependencies {
    api("org.joml:joml:$jomlVersion")
}
