/*Write a Java program to create an ArrayList of integers. Perform the following operations:
Add five integer elements to the list.Remove the third element.Update the second element with a new value.Display all the elements using a loop. */
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();

       n.add(25);
       n.add(26);
       n.add(27);
       n.add(28);
       n.add(29);

        n.remove(3);

        n.set(2, 45);

        
        System.out.println("arraylist");
        for (int i : n) {
            System.out.println(i);
        }
    }
}
