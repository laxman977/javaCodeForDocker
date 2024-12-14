package StreamApi2;

import java.util.Arrays;
import java.util.List;

// find Each element length in a Array
public class MapDemo1 {
    public static void main(String[] args){
        List<String> name = Arrays.asList("Car","Bur","Bike","Train");
        name.stream().map(Vname->Vname.length()).forEach(System.out::println);

    }
}
