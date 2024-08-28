import org.gradle.api.publish.maven.MavenPom

fun MavenPom.setupPom(pomName: String, pomDescription: String, pomPackaging: String) {
    name.set(pomName)
    description.set(pomDescription)
    url.set("https://github.com/Over-Run/overrungl")
    packaging = pomPackaging
    licenses {
        license {
            name.set("MIT")
            url.set("https://raw.githubusercontent.com/Over-Run/overrungl/main/LICENSE")
        }
    }
    organization {
        name.set("Overrun Organization")
        url.set("https://over-run.github.io")
    }
    developers {
        developer {
            id.set("squid233")
            url.set("https://github.com/squid233")
            organization.set("Overrun Organization")
            organizationUrl.set("https://over-run.github.io")
        }
    }
    scm {
        connection.set("scm:git:https://github.com/Over-Run/overrungl.git")
        developerConnection.set("scm:git:https://github.com/Over-Run/overrungl.git")
        url.set("https://github.com/Over-Run/overrungl.git")
    }
}
