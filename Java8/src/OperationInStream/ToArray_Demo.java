package OperationInStream;

import java.util.Arrays;
import java.util.List;

public class ToArray_Demo {
    public static void main(String[] args){
    List<String> StringList = Arrays.asList("A","B","C","1","2","3");
    Object arr[] =StringList.stream().toArray();
    System.out.println(arr.length);

    for (Object v:arr){
        System.out.println(v);
     }
    }
}
