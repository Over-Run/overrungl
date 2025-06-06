import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

fun Project.registerGenerateTask(main: String, targetProject: String) {
    tasks.register<GenerateTask>("generate") {
        mainClass.set(main)
        workingDir = project(targetProject).projectDir
        args(projectDir)
    }
}
