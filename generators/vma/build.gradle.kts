plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

registerGenerateTask("overrungl.vma.VMAGeneratorKt", ":vma", targetDir = "")
