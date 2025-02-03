// Abstract class Employee
abstract class Employee {
    protected String name;
    protected int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract methods
    public abstract double calculateSalary();
    public abstract void displayDetails();
}

// Derived class FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Implement calculateSalary method
    @Override
    public double calculateSalary() {
        return monthlySalary * 83.00; // Converting to Rupees (Assuming 1 USD = 83 INR)
    }

    // Implement displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: ₹" + calculateSalary());
    }
}

// Derived class PartTimeEmployee
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implement calculateSalary method
    @Override
    public double calculateSalary() {
        return (hourlyRate * 83.00) * hoursWorked; // Converting to Rupees
    }

    // Implement displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + (hourlyRate * 83.00 + "rupees"));
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary() + "rupees");
    }
}

// Main class to demonstrate polymorphism
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating an array of Employee objects
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Alice", 101, 5000);
        employees[1] = new PartTimeEmployee("Bob", 102, 20, 120);

        // Display details and calculate salary using overridden methods
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}
