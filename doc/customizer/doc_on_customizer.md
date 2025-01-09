# The Modules Customizer

This documentation is for customizer in version 0.6.0.

## Introduction

The modules customizer is provided in order to comfort the start of users' development.

## Selecting Version

The latest pre-release and snapshot version are provided.

## Selecting Modules

Different _modules_ and CPU _architectures_ may be chosen.
The customizer includes a set of _presets_, which contains various modules that are frequently used together.

There is a link to a table of supported architectures.
Note that if a module is selected with its unsupported architecture,
the customizer will not block you from copying the code,
but your build system will not be able to find an appropriate artifact.

## Generated Code

The _Gradle_ build script contains a repository for the current selected version and dependencies of selected modules.

_VM Option_ contains a line of JVM argument to enable native access for selected modules.

_JAR-file manifest attribute_ contains an attribute in MANIFEST.MF which just enables native access for every module. 
