import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import services.StudentClassService;

@Component
public class AppComponent {

    @Reference
    StudentClassService studentClassService;

    // Method to call all the defined services and their methods in some manner.
    @Activate
    void activate(){

        System.out.println("...Activating Main component...\n");

        System.out.println("\nAdding 3 student via addStudent() of StudentClassService service");
        studentClassService.addStudent(101, "Ammar", 80, 22);
        studentClassService.addStudent(102, "Shaozae", 67, 21);
        studentClassService.addStudent(103, "Shayan", 12, 23);

        System.out.println("\nDisplaying all students via getAllStudent() of StudentClassService");
        System.out.println("ID     NAME    MARKS     AGE");
        studentClassService.getAllStudents();

        System.out.println("\nChecking if certain student has passed using isStudentPassed() of StudentClassService");
        System.out.println("Ammar has passed: " + studentClassService.isStudentPassed(101));
        System.out.println("Shayan has passed: " + studentClassService.isStudentPassed(103));

        System.out.println("\nDeleting a student with ID 103");
        System.out.println(studentClassService.getStudent(103));

        studentClassService.deleteStudent(103);

        System.out.println("\nDisplaying remaining students");
        studentClassService.getAllStudents();
    }


    @Deactivate
    void deactivate(){
        System.out.println("...Main Component deactivated...");
    }

}
