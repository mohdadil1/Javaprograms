package Polymorphism.Method_overriding;
//method overriding
public class Vehicle {
    String name="car";
    public int t=5;
    public void get(){
        
        System.out.println(t);
    }
    
}
 class Car extends Vehicle{
    @Override
   public  void get() {
         
        t--; 
        System.out.println("name: " + name + ", total vehicle: " + t);
        
    }
}
