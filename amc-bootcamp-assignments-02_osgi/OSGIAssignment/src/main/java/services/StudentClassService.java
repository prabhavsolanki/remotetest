package services;

import bean.Student;

public interface StudentClassService {

    void addStudent(Integer id, String name, Integer marks, Integer age);
    void deleteStudent(Integer studentId);
    boolean isStudentPassed(Integer studentId);
    Student getStudent(Integer studentId);
    void getAllStudents();

}
