public class methodoverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder.add(3, 5));
        System.out.println(Adder.add(23.9, 3.9));
    }
}
class Adder{
    static int add (int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return (a+b);
    }
}
