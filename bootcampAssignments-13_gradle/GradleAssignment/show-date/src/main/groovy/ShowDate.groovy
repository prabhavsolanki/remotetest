import org.gradle.api.DefaultTask
import org.gradle.api.Task
import org.gradle.api.tasks.TaskAction


// Defining a ShowDate task that depends on the 'jar' task and shows the current date and time
class ShowDate extends DefaultTask{
    String message = "Current Date and Time: "

    @Override
    Task dependsOn(Object... paths) {
        return super.dependsOn('jar')
    }

    @TaskAction
    def showDate(){
        println message + new Date()
    }
}
