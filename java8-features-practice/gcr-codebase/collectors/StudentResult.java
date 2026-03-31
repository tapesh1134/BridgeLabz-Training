
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    String name;
    int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return name + " | " + grade;
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Map<Integer, List<Student>> studentMap = Stream
                .of(new Student("Tapesh", 8), new Student("Rohan", 7), new Student("Sam", 8))
                .collect(Collectors.groupingBy(n -> n.grade));

        for(int grade : studentMap.keySet()){
            System.out.println(studentMap.get(grade));
        }
    }
}
