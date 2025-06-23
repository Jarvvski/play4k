plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

rootProject.name = "play4k"

include("state-machine")
include("utilities")
include("aws-fargate")
