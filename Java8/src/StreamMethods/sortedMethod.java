package StreamMethods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class sortedMethod {
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,4,3,9,6,5,7,1,4);
        list1.stream().sorted().distinct().forEach(System.out::print);
    }
}
