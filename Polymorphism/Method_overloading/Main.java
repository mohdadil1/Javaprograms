package Polymorphism.Method_overloading;

public class Main {
    public static void main(String[] args) {
        //Static method calling
       // int a=Adder.add(10,20);
        //System.out.println(a);
        
       // Adder.add(10, 20, 30);
        //Adder.display();
       // System.out.println(Adder.add("mohd", "Adil"));
       //non static method
       Substract s1=new Substract();
       s1.sub(5, 10);
       s1.sub(3.2f, 2.5f);
      System.out.println( s1.sub(10, 5.5f));
       s1.display();
    }
    
}
