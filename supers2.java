public class supers2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.work();
    }
}
class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("eating again");
    }
    void bark(){
        System.out.println("barking");
    }
    void work(){
        super.eat();
        bark();
    }
}
