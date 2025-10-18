plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

registerGenerateTask("overrungl.shaderc.ShadercGeneratorKt", ":shaderc")
