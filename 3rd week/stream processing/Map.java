import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        // The Map Method
        // Map method is used to map each element to its corresponding function.
        List<Integer> mylist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = mylist.stream().map(e -> e * 2).collect(Collectors.toList());
        System.out.println(result);
    }
}
