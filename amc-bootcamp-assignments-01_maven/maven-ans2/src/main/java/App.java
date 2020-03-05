import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

// Simple MAVEN project wherein log4j dependency is added via the POM

public class App {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(App.class.getName());
        log.info("Hello from maven project");
    }
}
