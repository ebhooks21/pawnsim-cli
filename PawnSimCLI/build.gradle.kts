plugins {
    kotlin("jvm") version "2.3.10"
}

group = "org.ericbhooks"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.googlecode.lanterna:lanterna:3.1.5")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}