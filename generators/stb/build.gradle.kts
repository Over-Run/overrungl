plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

registerGenerateTask("overrungl.stb.STBGeneratorKt", ":stb", targetDir = "")
