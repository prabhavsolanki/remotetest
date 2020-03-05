import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

// A simple JAVA project where log4j dependency has been included into the project manually
// Aim of project is to display the overhead of adding multiple dependencies
// that are easily added by MAVEN

public class App {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(App.class.getName());
        log.info("Hello");
    }
}
