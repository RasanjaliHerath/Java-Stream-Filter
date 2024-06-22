import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperationAvoidingNullValues {
    public static void main(String[] args) {
        // Create a list of strings including null values
        List<String> words= Arrays.asList("JAVA","C++",null,"PHP",null,null,"Assembly",null,"c");
        // Stream operations on the 'words' list
        List<String> result=words.stream()
                // Filter operation: Keep only non-null elements
                .filter(w-> w!=null)
                // Collect the filtered elements into a new list
                .collect(Collectors.toList());
        // Print the result list containing non-null elements
        System.out.println(result);
    }
}
