import java.util.*;
public class trys {
    public static void main(String[] args) {
        try{
            int a = 50/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of code");
    }
}
