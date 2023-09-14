public class moverriding {
    public static void main(String[] args) {
        bike b = new bike();
        b.name1();
        
    }
}
class vehicle{
    void name1(){
        System.out.println("hero");
    }
}
class bike extends vehicle{
    void name1(){
        System.out.println("honda");
    }
}
