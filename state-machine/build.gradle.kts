plugins {
    id("buildlogic.kotlin-application-conventions")
}

dependencies {
    implementation(libs.bundles.k4)
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass = "com.github.jarvvski.play4k.AppKt"
}
