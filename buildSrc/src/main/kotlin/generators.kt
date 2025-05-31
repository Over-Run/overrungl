import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

// TODO: move generated sources
fun Project.registerGenerateTask(main: String, targetProject: String) {
    tasks.register<GenerateTask>("generate") {
        mainClass.set(main)
        workingDir = project(targetProject).projectDir
        args(projectDir)
    }
}
