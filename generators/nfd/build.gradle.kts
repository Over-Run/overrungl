plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

tasks.register<GenerateTask>("generate") {
    mainClass = "overrungl.nfd.NFDGeneratorKt"
    workingDir = project(":nfd").projectDir.resolve("src/main/java/")
}
