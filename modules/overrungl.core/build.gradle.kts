import java.nio.file.Files
import kotlin.io.path.Path

val overrunMarshalVersion: String by rootProject
val overrunPlatformVersion: String by rootProject

val jdkVersion: String by rootProject
val targetJavaVersion = jdkVersion.toInt()

dependencies {
    api("io.github.over-run:marshal:$overrunMarshalVersion")
    api("io.github.over-run:platform:$overrunPlatformVersion")
}

tasks.register("assembleJavadocArgs") {
    group = "build"
    val mspFile = Path("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args")
    outputs.file(mspFile)

    doLast {
        Files.deleteIfExists(mspFile)

        Files.writeString(
            mspFile, """
            --module-source-path
            ${rootProject.projectDir.path}/modules/*/src/main/java
        """.trimIndent()
        )
    }
}

tasks.register<Javadoc>("aggregateJavadoc") {
    javadocTool = javaToolchains.javadocToolFor {
        languageVersion = JavaLanguageVersion.of(targetJavaVersion)
    }
    dependsOn(tasks["assembleJavadocArgs"])
    group = "documentation"
    outputs.upToDateWhen { false }
    val projectsToDoc = Artifact.values().map { rootProject.project(it.subprojectName) }
    dependsOn(projectsToDoc.map { it.getTasksByName("classes", true) })
    source(projectsToDoc.map { it.sourceSets["main"].java })
    setDestinationDir(File("${rootProject.layout.buildDirectory.get().asFile}/docs/javadoc"))

    classpath = files(projectsToDoc.map { it.configurations["compileClasspath"].files })

//    executable = project.findProperty("javadocExecutable") as String?

    options.optionFiles = listOf(File("${rootProject.layout.buildDirectory.get().asFile}/tmp/modulesourcepath.args"))
}
