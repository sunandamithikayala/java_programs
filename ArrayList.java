//Write a Java program to create an ArrayList of integers. Perform the following operations:
//Add five integer elements to the list.
//Remove the third element.
//Update the second element with a new value.
//Display all the elements using a loop.
    
import java.util.HashSet;

public class ArrayList {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        
        cities.add("hyd");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("banglore");
        cities.add("Delhi"); // Duplicate entry

    
        System.out.println("Cities: " + cities);

        
        System.out.println("Does Mumbai exist? " + cities.contains("Mumbai"));

        
        cities.remove("Chennai");
        System.out.println("After removing Chennai: " + cities);
    }
}

