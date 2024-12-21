package com.streamsExamples;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");

        // Collect to a List
        List<String> uniqueNames = names.stream()
                                        .distinct()
                                        .collect(Collectors.toList());
        System.out.println("Unique Names: " + uniqueNames);

        // Grouping by first letter
        Map<Character, List<String>> groupedByLetter = names.stream()
                                                            .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Grouped by First Letter: " + groupedByLetter);

        // Joining all names into a single string
        String joinedNames = names.stream()
                                  .collect(Collectors.joining(", "));
        System.out.println("Joined Names: " + joinedNames);
    }
}
