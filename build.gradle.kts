plugins {
    java
    id("com.roscopeco.jasm") version "0.1-SNAPSHOT"
    application
}

group = "com.roscopeco.jasm"
version = "0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

application {
    mainClass.set("com.roscopeco.jasm.example.HelloWorld")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    testImplementation("org.assertj:assertj-core:3.22.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
