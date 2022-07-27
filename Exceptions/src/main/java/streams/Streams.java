package streams;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> sarasas = Arrays.asList("a","b","c","d","e");
        System.out.println(sarasas);

        sarasas.stream()
                .filter( kint -> kint.contains("a"))
                .forEach(elementas -> System.out.println(elementas));


    }
}
