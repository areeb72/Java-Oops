public class accessModifer {
    public static void main(String[] args) {
        name n = new name();
        n.display(); //error of access modfier
    }
}
class name{
    private String yourName = "Areeb";
    private void display(){
        System.out.print(yourName);
    }
}

