import org.gradle.plugins.ide.idea.model.IdeaModel

plugins {
    `java-library`
    `maven-publish`
    idea
}

val overrunglModuleNew = extensions.create<OverrunGLNewModuleExtension>("overrunglModuleNew")

val projGroupId: String by rootProject

val jspecifyVersion: String by rootProject
val junitVersion: String by rootProject

val jdkVersion: String by rootProject
val jdkEnablePreview: String by rootProject
val targetJavaVersion = jdkVersion.toInt()

group = projGroupId

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jspecify:jspecify:$jspecifyVersion")
    testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    if (jdkEnablePreview.toBoolean()) options.compilerArgs.add("--enable-preview")
    options.release.set(targetJavaVersion)
    options.javaModuleVersion.set(overrunglModuleNew.artifactVersion)
}

tasks.withType<Test> {
    if (jdkEnablePreview.toBoolean()) jvmArgs("--enable-preview")
    useJUnitPlatform()
}

extensions.configure<JavaPluginExtension>("java") {
    toolchain.languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))
    withJavadocJar()
    withSourcesJar()
}

tasks.withType<Jar> {
    archiveBaseName = overrunglModuleNew.artifactName
    archiveVersion = overrunglModuleNew.artifactVersion
}

the<IdeaModel>().module {
    inheritOutputDirs = true
}

publishing {
    repositories {
    }
}
