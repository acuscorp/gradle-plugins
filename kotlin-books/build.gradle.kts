
subprojects{
  repositories {
    mavenCentral()
  }

  apply(from = rootProject.file("gradle/licensing.gradle"))

  apply(plugin = "kotlin-conventions")
}