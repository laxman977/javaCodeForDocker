package StreamApi2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// filter Null form the Collection
public class FilterDemo2 {
    public static void main(String[] args)
    {
        List<String>  word = Arrays.asList("cup",null,"forest","book",null);
        List<String> result = new ArrayList<String>() ;

       result= word.stream().filter(w-> w!=null).collect(Collectors.toList());
       System.out.println(result);
  }
}
