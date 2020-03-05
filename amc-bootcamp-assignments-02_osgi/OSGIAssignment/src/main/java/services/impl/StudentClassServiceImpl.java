package services.impl;

import bean.Student;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import services.ClassConfigurationService;
import services.StudentClassService;

import java.util.ArrayList;
import java.util.List;

@Component(service = StudentClassService.class)
public class StudentClassServiceImpl implements StudentClassService {

    // studentList hold objects of Student class
    List<Student> studentList = new ArrayList<Student>();

    // Calling via Reference ClassConfigurationService
    @Reference
    ClassConfigurationService classConfigurationService;

    public void addStudent(Integer id, String name, Integer marks, Integer age) {

        if(!classConfigurationService.isClassLimitReached(studentList)){
            studentList.add(new Student(id, name, marks, age));
        } else {
            System.out.println("Class Limit reached. Can't add more students to class");
        }

    }

    public void deleteStudent(Integer studentId) {
        if(!studentList.isEmpty()){
            studentList.remove(getStudent(studentId));
        } else {
            System.out.println("Student List is empty");
        }
    }

    public boolean isStudentPassed(Integer studentId) {
        return getStudent(studentId).getMarksObtained() >= classConfigurationService.getPassingMarks();
    }

    public Student getStudent(Integer studentId) {
        return studentList.stream().filter(student -> student.getId() == studentId).findFirst().orElse(null);
    }

    public void getAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Activate
    void activate(){
        System.out.println("...Student class service started...");
    }

    @Deactivate
    void deactivate(){
        System.out.println("...Student class service stopped...");
    }

    public void unexposedMethod(){
        System.out.println("This method is not exposed");
    }

}
