plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

registerGenerateTask("overrungl.nfd.NFDGeneratorKt", ":nfd")
