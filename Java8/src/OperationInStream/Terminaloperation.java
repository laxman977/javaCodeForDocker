package OperationInStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Terminaloperation {
    public static void main (String[] args){
        List<Integer> number = Arrays.asList(1,2,5,4,6,7,8,10);

        // count
       long numberofEvenNumber = number.stream().filter(num -> num%2==0).count();
       System.out.println("To Count The Number Of element present in the List:-> "+numberofEvenNumber);

       // min()
       Optional<Integer> min= number.stream().min((val1, val2)-> {return val1.compareTo(val2);});
       System.out.println("To get Minimum Value of the collection:-> "+min.get());

       //Max()
        Optional<Integer> max= number.stream().max((val1, val2)-> {return val1.compareTo(val2);});
        System.out.println("To get Maximum Valu   e of the collection:-> "+max.get());

    }
}
