package StreamApi;

import java.util.Arrays;
import java.util.List;

public class CustomerUtils {
    public static List<Customer> getCustomerData() {
        // creating the address class object
     Address homeAddress =  new Address("101", "Abc Street", "TamilNadu");
     Address officeAddress =  new Address("102", "cde Street", "hyderabad");

     // creating the customer class object
     Customer customer = new Customer(1, "Srikanth", "Hyderabad", "srikanth@123", "1234567890", Arrays.asList(homeAddress));
     Customer customer2 = new Customer(2, "Laxman", "Bangaluru", "Laxman@123", "7978940947", Arrays.asList(officeAddress));
     Customer customer3 = new Customer(3, "Rajesh", "Baripada", "Rajesh@123", "1238907890", Arrays.asList(homeAddress));

     return Arrays.asList(customer, customer2, customer3);

    }
}
