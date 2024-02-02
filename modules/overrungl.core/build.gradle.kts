val overrunMarshalVersion: String by rootProject
val overrunPlatformVersion: String by rootProject

dependencies {
    api("io.github.over-run:marshal:$overrunMarshalVersion")
    api("io.github.over-run:platform:$overrunPlatformVersion")
}
