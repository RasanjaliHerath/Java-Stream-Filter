import java.util.Arrays;
import java.util.List;

public class MultipleFilterOperation {
    public static void main(String[] args) {
        // Create a list of strings using Arrays.asList
        List<String> name = Arrays.asList("Java","C++","C","Python","Assembly","PHP");
        // Stream operations on the 'name' list
        name.stream()
                // Filter operation: Keep only strings with length greater than 1 and less than 4
                .filter(str-> str.length()>1 && str.length()<4)
                // For each filtered string, print it to the console
                .forEach(System.out::println);
    }
}
