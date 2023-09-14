public class interface4 {
    public static void main(String[] args) {
        todo t = new todo();
        t.draw();
        t.show();

    }
}
interface drawable{
    void draw();
}
interface showable extends drawable{
    void show();
}
class todo implements showable{
    public void draw(){
        System.out.println("DRAWIN");
    }
    public void show(){
        System.out.println("showing");
    }
}