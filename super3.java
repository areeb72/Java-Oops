public class super3 {
    public static void main(String[] args) {
        dog d = new dog();
    }
}
class Animal{
    Animal(){
        System.out.println("Anmimal is created");
    }
}
class dog extends Animal{
    
    dog(){
        super();
        System.out.println("Dog is created");
    }
}
