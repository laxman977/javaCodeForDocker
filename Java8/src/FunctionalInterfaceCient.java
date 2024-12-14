public class FunctionalInterfaceCient {

    public static void main(String[] args) {
        // providing the implementation to the functional interface
    Message printmessage = (String message) -> System.out.println(message);
        // Calling the functional interface
    printmessage.textMessage("Hello World");
    }
}
