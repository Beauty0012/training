import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeStream{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alina", 28, 50000),
            new Employee("Beauty", 35, 70000),
            new Employee("Carlo", 32, 65000),
            new Employee("David", 29, 48000),
            new Employee("Eva", 40, 72000)
        );

        List<String> filteredNames = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .map(Employee::getName)
            .collect(Collectors.toList());

        double avgSalary = employees.stream()
            .filter(emp -> emp.getAge() > 30)
            .mapToDouble(Employee::getSalary)
            .average()
            .orElse(0.0);

        System.out.println("Employees older than 30: " + filteredNames);
        System.out.println("Average salary: " + avgSalary);
    }
}
