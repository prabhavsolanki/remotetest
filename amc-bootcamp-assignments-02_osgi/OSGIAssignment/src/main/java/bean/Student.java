package bean;

public class Student {

    private Integer id;
    private String name;
    private Integer marksObtained;
    private Integer age;

    public Student(Integer id, String name, Integer marks, Integer age){
        this.id = id;
        this.name = name;
        marksObtained = marks;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getMarksObtained() {
        return marksObtained;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marksObtained + " " + age;
    }
}
