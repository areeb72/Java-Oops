public class interfaces2 {
    public static void main(String[] args) {
        drawable d1 = new circle();
        drawable d2 = new rectangle();
        d1.draw();
        d2.draw();
    }
}
interface drawable{
    void draw();
}
class rectangle implements drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class circle implements drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}