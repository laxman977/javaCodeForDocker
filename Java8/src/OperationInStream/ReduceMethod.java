package OperationInStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMethod {
    public static void main(String[] args){
        List<String> StringList = Arrays.asList("A","B","C","1","2","3");
         Optional<String> reduse =   StringList.stream().reduce((value, combinedvalue)->{return combinedvalue+value;});
         System.out.println(reduse.get());
    }
}
