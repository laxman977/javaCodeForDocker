import java.util.function.Predicate;

public class Main {
    public static void main(String[] args)
    {
        Predicate<Integer> pi = x -> x % 2 == 0;
        System.out.println(pi.test(10));
    }
}

