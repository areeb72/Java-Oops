class student{
    int roll;  //instance variable
    String name;  //instance variable
    static String college = "Galgotias"; //static variable

    student(int r, String n){
        roll= r;
        name=n;
    }
    void display(){
        System.out.println(roll+ " "+name +" "+college );
    }
}
    public class statics{
        public static  void main (String args[]){
            student s1 = new student(111, "areeb");
            student s2= new student(222, "rahul");
            student s3 = new student(333, "hassan");
            student s4= new student(444, "raj");


            s1.display();
            s2.display();
            s3.display();
            s4.display();
        }

    }
