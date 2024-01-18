import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1
        String[] arr = { "Geeks", "for", "Geeks" };
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(str -> System.out.print(str + " "));

        // 2
        System.out.println();
        int arr2[] = { 1, 2, 3, 4, 5 };
        IntStream stream2 = Arrays.stream(arr2);
        stream2.forEach(str -> System.out.print(str + " "));

        // 3
        System.out.println();
        String[] arr3 = { "Geeks", "for", "Geeks",
                "A", "Computer", "Portal" };
        Stream<String> stream3 = Arrays.stream(arr3, 3, 6);
        stream3.forEach(str -> System.out.print(str + " "));

        // 4
        System.out.println();
        int arr4[] = { 1, 2, 3, 4, 5 };
        IntStream stream4 = Arrays.stream(arr4, 1, 3);
        stream4.forEach(str -> System.out.print(str + " "));
    }
}