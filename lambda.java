import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class lambda {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted in reverse order: " + words);

        StringProcessor toUpperCaseProcessor = String::toUpperCase;
        
        words.forEach(word -> System.out.println("Uppercase: " + toUpperCaseProcessor.process(word)));
    }
}
