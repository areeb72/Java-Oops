public class mlevelInheritence {
    public static void main(String[] args) {
        babyDog D = new babyDog();
        D.weep();
        D.bark();
        D.eat();
        
    }
}
    class Animal{
        void eat (){
            System.out.println("eating");
        } 
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("Barking");
        }
    }
    class babyDog extends Dog{
        void weep(){
            System.out.println("weeping");
        }

    }

    
    

