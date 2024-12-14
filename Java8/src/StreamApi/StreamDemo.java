package StreamApi;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // getting the customer information from collection object
        List<Customer> customerList = CustomerUtils.getCustomerData();

        // converting the list object to stream object
        Stream<Customer> customerstream = customerList.stream();

        // wanted to display customer information
        Consumer<Customer> CustomerConsumer = customer -> System.out.println(customer);

        customerstream.forEach(CustomerConsumer);

    }
}
