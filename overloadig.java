public class overloadig {
    public static void main(String[] args) {
        System.out.println(Adder.add(23, 45, 4));
        System.out.println(Adder.add(34, 6));
        
    }
}
class Adder{
    static int add(int a, int b){
        return a+b;


    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}

