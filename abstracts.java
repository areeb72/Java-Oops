public class abstracts {
    public static void main(String[] args) {
     bike b= new hero();
        b.run();
        
     };   
    

}
 abstract class bike{
    abstract void run();
}
class hero extends bike{
    void run(){
        System.out.println("hero is running");
    }
}
