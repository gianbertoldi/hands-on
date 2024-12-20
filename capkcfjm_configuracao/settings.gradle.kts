buildscript {
    repositories.mavenCentral()
    dependencies.classpath("bergs.pwx.build.plugins:mmd-gradle-plugin:${extra["mm.plugin.version"]}")
}
apply(plugin = "bergs.pwx.gradle.settings")

includeFlat(
	"capuaajm_teste_funcional"
)