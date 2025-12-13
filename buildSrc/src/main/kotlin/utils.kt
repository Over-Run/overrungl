import groovy.json.JsonSlurper
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPom
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.the
import java.io.File
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

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

fun Project.setupPublication() {
    the<PublishingExtension>().publications {
        register<MavenPublication>(overrunglModuleNew.artifactName.map { "Maven$it" }.get()) {
            groupId = project.group.toString()
            artifactId = overrunglModuleNew.artifactName.get()
            version = overrunglModuleNew.artifactVersion.get()
            description = overrunglModuleNew.description.get()
            from(components["java"])
            pom {
                setupPom(overrunglModuleNew.projectTitle.get(), overrunglModuleNew.description.get(), "jar")
            }
        }
    }
}

fun suggestGitHubToken(token: String?) {
    if (token == null) {
        System.err.println("warning: GitHub token not found; use token to send requests at a larger rate.")
        System.err.println("note: specify the token with project property overrungl.native.download.github.token or system property or environment variable OVERRUNGL_NATIVE_DOWNLOAD_GITHUB_TOKEN")
    }
}

fun HttpClient.downloadRepoFile(token: String?, owner: String, repo: String, path: String, dst: File) {
    println("Downloading file from $owner/$repo/$path to $dst")

    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://api.github.com/repos/$owner/$repo/contents/$path"))
        .header("Accept", "application/vnd.github.object")
        .also {
            if (token != null) {
                it.header("Authorization", "Bearer $token")
            }
        }
        .header("X-GitHub-Api-Version", "2022-11-28")
        .build()
    val response = send(request, HttpResponse.BodyHandlers.ofString())

    if (response.statusCode() != 200) {
        System.err.println("warning: failed to download information of $owner/$repo/$path; response code: ${response.statusCode()}")
        return
    }

    val parse = JsonSlurper().parseText(response.body()) as Map<*, *>
    val url = parse["download_url"] as String

    val fileRequest = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .build()
    val fileResponse = send(fileRequest, HttpResponse.BodyHandlers.ofInputStream())
    if (fileResponse.statusCode() != 200) {
        System.err.println("warning: failed to download $owner/$repo/$path; response code: ${response.statusCode()}")
        fileResponse.body().close()
        return
    }

    dst.outputStream().buffered().use { os ->
        fileResponse.body().buffered().use { it.transferTo(os) }
    }
}
