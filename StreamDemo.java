import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;
    double salary;

    // Constructor
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
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

public class StreamDemo {
    public static void main(String[] args) {
        // List of employees
        List<Employee> employees = Arrays.asList(
            new Employee("John", 22, 50000),
            new Employee("Jane", 30, 60000),
            new Employee("Alex", 27, 55000),
            new Employee("Emily", 24, 45000)
        );

        // Filter employees older than 25
        List<String> employeeNames = employees.stream()
                                              .filter(e -> e.getAge() > 25) // Filter condition
                                              .map(Employee::getName)        // Extract names
                                              .collect(Collectors.toList()); // Collect to list

        // Calculate average salary of employees older than 25
        double averageSalary = employees.stream()
        .filter(e -> e.getAge() > 25)   // Filter condition
       .mapToDouble(Employee::getSalary) // Extract salaries
        .average()                      // Calculate average
        .orElse(0.0);                   // Default to 0 if no employees

        // Output the result
        System.out.println("Employee names older than 25: " + employeeNames);
        System.out.println("Average salary of employees older than 25: " + averageSalary);
    }
}
