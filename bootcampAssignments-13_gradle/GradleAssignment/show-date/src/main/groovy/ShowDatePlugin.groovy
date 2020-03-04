import org.gradle.api.Plugin
import org.gradle.api.Project


// Defining a ShowDatePlugin that makes use of the showDate task.
// This is an independent plugin and can be used throughout the enterprise
class ShowDatePlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task("showDate", type: ShowDate)
    }
}
