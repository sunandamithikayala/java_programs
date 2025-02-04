//Write a Java program to create a HashSet of strings. Perform the following operations:
//Add five city names to the set, ensuring at least one duplicate entry.
//Display the elements to show that duplicates are not allowed.
//Check if a particular city exists in the set.
//Remove a city and display the updated set.
import java.util.HashSet;

public class HashSetString{
    public static void main(String[] args) {
        
        HashSet<String> cities = new HashSet<>();

        
        cities.add("New York");
        cities.add("paris");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("New York"); // Duplicate entry

        // Display the HashSet (duplicates are automatically removed)
        System.out.println("Cities in the set: " + cities);

        // Check if a particular city exists
        String cityToCheck = "Chicago";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the set.");
        } else {
            System.out.println(cityToCheck + " does not exist in the set.");
        }

        // Remove a city
        String cityToRemove = "paris";
        cities.remove(cityToRemove);
        System.out.println("Cities after removing " + cityToRemove + ": " + cities);
    }
}
