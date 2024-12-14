package StreamApi2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String empName;
    int salary;

    Employee(int empid,String empName,int salary){
        this.empid = empid;
        this.empName = empName;
        this.salary = salary;
    }
}

public class MapDemo3 {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"Ram",20000),
                new Employee(2,"Shyam",30000),
                new Employee(3,"Hari",40000),
                new Employee(4,"Sita",50000),
                new Employee(5,"Gita",60000)
        );

                employeeList.stream().filter(e -> e.salary > 30000 )
                        .map(e->e.salary)
                        .forEach(System.out::println);
    }
}
