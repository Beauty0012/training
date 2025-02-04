import java.util.*;
public class hashmap {
    
        public static void main(String[] args) {
            
            HashMap<Integer, String> students = new HashMap<>();
    
           
            students.put(101, "Saina");
            students.put(102, "Beauty");
            students.put(103, "Arun");
            students.put(104, "David");
            students.put(105, "Swati");
    
            int rollNumberToFind = 103;
            if (students.containsKey(rollNumberToFind)) {
                System.out.println("Student with roll number " + rollNumberToFind + ": " + students.get(rollNumberToFind));
            } else {
                System.out.println("Roll number " + rollNumberToFind + " not found.");
            }
    
            int rollNumberToRemove = 102;
            students.remove(rollNumberToRemove);
            System.out.println("\nRemoved student with roll number " + rollNumberToRemove);
    
        
            System.out.println("\nUpdated Student Records:");
            for (Map.Entry<Integer, String> entry : students.entrySet()) {
                System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
            }
        }
    }
    
