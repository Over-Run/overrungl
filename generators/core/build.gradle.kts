plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

registerGenerateTask("overrungl.CoreGeneratorKt", ":core", targetDir = "")
