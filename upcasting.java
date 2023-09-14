public class upcasting {
    public static void main(String[] args) {
        bike b = new spelondor(); //upcasting
        b.run();
    }
}
class bike{
    void run(){
        System.out.println("running");
    }
}
class spelondor extends bike{
    void run(){
        System.out.println("running safely");
    }
}