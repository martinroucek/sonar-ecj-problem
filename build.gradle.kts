plugins {
    java
    id("org.sonarqube") version "2.8"
}

repositories {
    mavenCentral()
}

dependencies {
    "compile"(group = "net.openhft", name = "affinity", version = "3.2.2")
    "compile"("com.google.inject:guice:4.2.2")
}