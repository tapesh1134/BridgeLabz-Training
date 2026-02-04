
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {

    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeSalary {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Raj", "IT", 10000),
                new Employee("Sam", "HR", 21000),
                new Employee("Rohan", "HR", 15000),
                new Employee("Ankit", "IT", 21000)
        );

        Map<String, Double> salaryMap = employeeList
                .stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary))
                );

        System.out.println(salaryMap);
    }
}
