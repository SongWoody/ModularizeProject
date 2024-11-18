import com.woody.convention.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class HiltPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("dagger.hilt.android.plugin")
                apply("com.google.devtools.ksp")
            }

            val libs = libs
            dependencies {
                "implementation"(libs.findLibrary("hilt.core").get())
                "ksp"(libs.findLibrary("hilt.compiler").get())

                "implementation"(libs.findLibrary("hilt.android").get())
                "ksp"(libs.findLibrary("hilt.android.compiler").get())
                "kspAndroidTest"(libs.findLibrary("hilt.android.compiler").get())
            }
        }
    }
}