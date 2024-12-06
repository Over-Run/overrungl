plugins {
    id("me.champeau.jmh") version "0.7.2"
    id("module.conventions")
    id("submodule.conventions")
}

overrunglModule {
    artifactName = "overrungl-samples"
}

val jmhVersion: String by rootProject
val junitVersion: String by rootProject
val timerVersion: String by rootProject

dependencies {
    Artifact.values().forEach {
        implementation(project(it.subprojectName))
    }
    implementation("io.github.over-run:timer:$timerVersion")
    jmh("org.openjdk.jmh:jmh-core:$jmhVersion")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:$jmhVersion")
    testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
