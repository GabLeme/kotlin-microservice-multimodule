import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.3.2.RELEASE"
	id("io.spring.dependency-management") version "1.0.9.RELEASE"
	id("io.freefair.lombok") version "5.1.1"
	id("org.jetbrains.kotlin.plugin.allopen") version "1.3.71"
	kotlin("jvm") version "1.3.72"
	kotlin("plugin.spring") version "1.3.72"
}
group = "com.microservice.auth"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	mavenCentral()
	maven("https://plugins.gradle.org/m2/")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

subprojects {
	group = "com.microservice.auth"
	version = "0.0.1-SNAPSHOT"
	apply(plugin = "org.jetbrains.kotlin.plugin.allopen")
	apply(plugin = "org.jetbrains.kotlin.plugin.spring")
	apply(plugin = "kotlin")
	apply(plugin = "org.springframework.boot")
	apply(plugin = "io.spring.dependency-management")
	apply(plugin = "io.freefair.lombok")
	repositories {
		mavenCentral()
		maven("https://plugins.gradle.org/m2/")
	}

	tasks.jar {
		enabled = true
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("com.h2database:h2")
	}


}
