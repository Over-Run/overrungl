plugins {
    `java-library`
}

val projVersion: String by rootProject

dependencies {
    compileOnly(project(":core"))
    constraints { api("io.github.over-run:overrungl:$projVersion") }
}
