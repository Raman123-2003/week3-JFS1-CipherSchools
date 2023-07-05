import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
    public static void main(String[] args) {
        List<Object> mylist = Arrays.asList(true, 100, 'a', "hello", 42);
        
        List<Object> result = mylist.stream()
                .filter(e -> e.getClass().getSimpleName().equals("Integer"))
                .collect(Collectors.toList());
        
        System.out.println(result);

        mylist.forEach(m -> {
            System.out.println(m + " -> " + m.getClass().getSimpleName());
        });

        long totalIntegers = mylist.stream()
                .filter(e -> e.getClass().getSimpleName().equals("Integer"))
                .count();
        
        System.out.println("Total Integers: " + totalIntegers);
    }
}
