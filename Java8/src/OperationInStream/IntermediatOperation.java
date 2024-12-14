package OperationInStream;

import java.util.Arrays;
import java.util.List;

//distinct() limit() //count()
public class IntermediatOperation {

     public static void main(String[] args) {
       List<String> vehiclesList = Arrays.asList("Bus","Car","Bycle","bike","Car","Truck");
       // distinct
         vehiclesList.stream().distinct().forEach(System.out::println);

         //Count()
       long count = vehiclesList.stream().count();
       System.out.println("The number of Element in are : -->"+ count);

         //limit()
         vehiclesList.stream().limit(3).forEach(vechil->System.out.println("Limited vechila Are :->"+vechil));
     }



}
