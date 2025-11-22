
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

fun Project.registerGenerateTask(main: String, targetProject: String) {
    tasks.register<GenerateTask>("generate") {
        mainClass.set(main)
        workingDir = project(targetProject).projectDir
        args(projectDir)
        jvmArgs("-Dstdout.encoding=UTF-8", "-Dstderr.encoding=UTF-8")
    }


    tasks.register("cleanGenSrc") {
        val dir = project(targetProject).projectDir.resolve("src/main/generated/")
        doLast {
            dir.deleteRecursively()
        }
    }
}
