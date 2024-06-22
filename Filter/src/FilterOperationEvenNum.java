import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class SingleFilterOperation {
    public static void main(String[] args) {
        // Create a list of integers using Arrays.asList
        List<Integer> numbersList= Arrays.asList(100,101,102,103,104,105);
        // Stream operations on numbersList
        numbersList.stream()
                // Filter operation: Keep only elements that are even (n % 2 == 0)
                .filter(n -> n%2 == 0)
                // For each filtered element, print it to the console
                .forEach(System. out::println) ;

    }
}

