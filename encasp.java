public class encasp {
    public static void main(String[] args) {
        company c = new company();
        c.setEmpid(101);
        System.out.println(c.getEmpid());

    }
class company{
    private int empid ;

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getEmpid() {
        return empid;
    }
    
}
}