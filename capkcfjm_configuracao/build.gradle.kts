plugins {
    id("bergs.pwx.gradle.testes.mobile")
}

subprojects {
	apply(plugin = "bergs.pwx.gradle.testes.mobile")
	dependencies {
		implementation("com.github.javafaker:javafaker:1.0.2")
	}
}
