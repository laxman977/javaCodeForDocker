import java.util.function.Predicate;

public  class  checkFirstAlphabetIs {
    public static void main(String[] args){
        String[] names = {"Anushka","sneha","nisha"};
        Predicate<String> p = name -> name.charAt(0) == 'A';
        for(String name : names){
            if(p.test(name)){
                System.out.println(name);
            }
        }
    }
        }
