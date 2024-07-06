import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("com.google.guava:guava:11.0.2")
}
tasks.register("prepareKotlinBuildScriptModel"){}
tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks {
    val shadowJar by getting(ShadowJar::class) {
        manifest.attributes["Main-Class"] = "org.example.Main"
    }
}



