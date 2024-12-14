package StreamApi2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 10);
        List<String> strList = Arrays.asList("a", "b", "c", "d",null);
        List<Integer> numList2 = Arrays.asList(5, 6, 7, 8);

        List<? extends List<? extends Serializable>> list = Arrays.asList(numList, strList, numList2);
       List<Serializable> flatList = list.stream().flatMap(l->l.stream()).filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(flatList);

    }
}
