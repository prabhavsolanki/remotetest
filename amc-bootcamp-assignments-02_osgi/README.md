# AMC Bootcamp Assignments
## OSGI
### Assignment


##### Questions

1. Create service ClassConfigurationService that allows two configuration :

- No. of students allowed in the class

- marks required by the student to pass the class

	also it exposes two methods :



- isClassLimitReached(List)  // returns true if the list size is less than the configured allowed size

- getPassingMarks()   // returns the passing marks required

 

2. Create another service StudentClassService that maintains the list of students in the class and make use of ClassConfigurationService and exposes the following methods :


- addStudent(student values)

- deleteStudent(id)

- isStudentPassed(id)

- getStudent(id)

- getAllStudents()

#### Note: 

- A student may have id,name , marks obtained,age etc

- Access the service and print a students information.

- Also, I have included a directory contaning Felix GoGo console to test the bundle.
