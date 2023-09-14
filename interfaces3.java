public class interfaces3 {
    public static void main(String[] args) {
        work w1 = new work();
        w1.draw();
        w1.show();
    }
}
//multiple inheritence through interface...//
interface drawable{
    void draw();
}
interface showable{
    void show();
}
class work implements drawable, showable{
    public void draw(){
        System.out.println("drawing");
    }
    public void show(){
        System.out.println("showing");
    }

}

