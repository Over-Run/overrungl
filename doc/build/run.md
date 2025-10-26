# Running Samples

You must download native library files from repositories listed in [publish.md](publish.md).

Use `gradlew downloadLatestNatives` to conveniently download files from these repositories.
You need to generate a GitHub token with `public_repo` permission
and specify `overrungl.github.release.token` in `GRADLE_USER_HOME/gradle.properites`.

Use `gradlew deployNatives` to copy files to a specified directory as the working directory of samples.
