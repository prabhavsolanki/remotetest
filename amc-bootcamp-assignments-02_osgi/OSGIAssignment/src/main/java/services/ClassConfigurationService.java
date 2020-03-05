package services;

import bean.Student;
import java.util.List;

public interface ClassConfigurationService {

    boolean isClassLimitReached(List<Student> studentList);
    Integer getPassingMarks();

}
