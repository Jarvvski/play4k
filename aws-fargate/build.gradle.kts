plugins {
    id("buildlogic.kotlin-application-conventions")
    alias(libs.plugins.sb)
    alias(libs.plugins.kotlin.spring)
}

dependencies {
    implementation(libs.bundles.k4)
    implementation(libs.bundles.sb)
    implementation(project(":utilities"))
}
