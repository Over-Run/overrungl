import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

// TODO: move generated sources
fun Project.registerGenerateTask(main: String, targetProject: String, targetDir: String = "src/main/java/") {
    tasks.register<GenerateTask>("generate") {
        mainClass.set(main)
        workingDir = project(targetProject).projectDir.resolve(targetDir)
        args(projectDir)
    }
}
