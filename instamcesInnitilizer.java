public class instamcesInnitilizer {
    public static void main(String[] args) {
        bike b1 = new bike();
        bike b2 = new bike();


    }
}
class bike{
    int speed;
    bike(){
        System.out.println("speed = " + speed);
    }
    {
        speed = 100;
    }
}