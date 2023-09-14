public class supers {
    public static void main(String[] args) {
        dog d = new dog();
        d.display();
    }
}
class Animal{
    String color = "white";
}
class dog extends Animal{
    String color = "Black";
    void display(){
        System.out.println(color);
        System.out.print(super.color);

    }
}
