import gradle.kotlin.dsl.accessors._0b0d613fe934aa5ec82efe4f67f155eb.compileKotlin
import gradle.kotlin.dsl.accessors._0b0d613fe934aa5ec82efe4f67f155eb.implementation
import gradle.kotlin.dsl.accessors._0b0d613fe934aa5ec82efe4f67f155eb.testImplementation
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

plugins{
    kotlin("jvm")
}


dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:30.1.1-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

tasks{
    compileKotlin {
        kotlinOptions {
            allWarningsAsErrors = true
        }
    }
}