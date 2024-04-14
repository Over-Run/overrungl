plugins {
    id("me.champeau.jmh") version "0.7.2"
}

val projModules: String by project

dependencies {
    Artifact.values().forEach {
        implementation(project(it.subprojectName))
    }
    implementation("io.github.over-run:timer:0.3.0")
    jmh("org.openjdk.jmh:jmh-core:1.37")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.37")
}
