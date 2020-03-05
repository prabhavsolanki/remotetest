package services.impl;

import bean.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.metatype.annotations.Designate;
import services.ClassConfigurationService;
import java.util.List;

@Component(service = ClassConfigurationService.class)
@Designate(ocd = StudentConfig.class)
public class ClassConfigurationServiceImpl implements ClassConfigurationService {

    @Activate
    StudentConfig studentConfig;    // Instantiating configuration class here to make it available within class scope
    // Method to print to console when service starts
    void activate(){
        System.out.println("...Class Configuration service started...");
    }

    @Deactivate
    // Method to print to console when service stops
    void deactivate(){
        System.out.println("...Class configuration service stopped...");
    }

    // Injecting configurations using StudentConfig
    public boolean isClassLimitReached(List<Student> studentList) {
        return (studentList.size() > studentConfig.maxStudents());
    }

    // Injecting configurations using StudentConfig
    public Integer getPassingMarks() {
        return studentConfig.passingMarks();
    }

}
