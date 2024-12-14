package StreamApi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_Example_1 {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Laxman", "Sachin", "Joffery", "Vijay");
        name.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList()).forEach(System.out::println);

    }
}
