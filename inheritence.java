public class inheritence {
    public static void main(String[] args) {
        programmer p = new programmer();
        System.out.println(p.salary);
        System.out.println(p.bonus);
        
    }
    
}
class employee{
    float salary = 45000;
}
class programmer extends employee{
    int bonus = 4000;
}

