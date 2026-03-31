
class Person {

    private String name;
    private int age;

    public Person() {
        this("Sample", 10);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {

    private String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {
        Person p1 = new Student("Tapesh", 21, "DPS");
    }
}
