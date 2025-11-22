plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

registerGenerateTask("overrungl.tinyfd.TinyFDGeneratorKt", ":tinyfd")
