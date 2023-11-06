
public class Parent { 
    public static void m1(){
        System.out.println("From parent class"+" "+"static method");
    }
    void m2(){
        System.out.println("From parent"+" "+"non staic method");
    }

}
class child extends Parent{
    public static void m1(){
        System.out.println("From child class"+" "+"static method");
    }
    void m2(){
        System.out.println("From child class"+" "+"non method");
    }
}
