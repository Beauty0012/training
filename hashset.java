
import java.util.*;
public class hashset {
    
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");
        cities.add("Chicago"); 

        System.out.println("Cities in the HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }

        String cityToCheck = "Los Angeles";
        if (cities.contains(cityToCheck)) {
            System.out.println("\n" + cityToCheck + " is present in the HashSet.");
        } else {
            System.out.println("\n" + cityToCheck + " is not found in the HashSet.");
        }

        // Remove a city and display the updated set
        cities.remove("Houston");
        System.out.println("\nUpdated HashSet after removing 'Houston':");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}

