package StreamApi2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Take every element and  multiply with 3
public class MapDemo2 {
    public static void  main(String[] args) {
        List<Integer> numberList = Arrays.asList(2, 3, 4, 5);
        List<Integer> MultiplyNumber = numberList.stream().map(num -> num * 3).collect(Collectors.toList());
        System.out.println(MultiplyNumber);
    }
}
