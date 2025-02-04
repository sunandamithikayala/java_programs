//Write a Java program to implement a HashMap that stores student roll numbers (Integer) as keys and their names (String) as values. Perform the following operations:
//Insert five student records.
//Retrieve and display the name of a student using a specific roll number.
//Remove a student entry using a roll number.
//Display all student records.
//import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class StudentsList {
    public static void main(String[] args) {
        // Create a HashMap to store roll numbers (Integer) and student names (String)
        HashMap<Integer, String> students = new HashMap<>();

        // Insert five student records
        students.put(1, "kavya");
        students.put(2, "Boby");
        students.put(3, "charan");
        students.put(4, "vamsi");
        students.put(5, "navya");

        // Retrieve and display the name of a student using a roll number
        int rollNumberToFind = 103;
        if (students.containsKey(rollNumberToFind)) {
            System.out.println("Student with roll number " + rollNumberToFind + ": " + students.get(rollNumberToFind));
        } else {
            System.out.println("Student with roll number " + rollNumberToFind + " not found.");
        }

        // Remove a student entry using a roll number
        int rollNumberToRemove = 102;
        students.remove(rollNumberToRemove);
        System.out.println("Removed student with roll number " + rollNumberToRemove);

        // Display all student records
        System.out.println("\nAll Student Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}


