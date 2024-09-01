plugins {
    id("generator.conventions")
}

dependencies {
    implementation(project(":generators"))
}

tasks.register<GenerateTask>("generate") {
    mainClass.set("overrungl.opengl.OpenGLGeneratorKt")
    workingDir = project(":opengl").projectDir.resolve("src/main/java/overrungl/opengl")
}
