package Inheritance;
//multilevel 
public class Animal {
    String name;

    public Animal(String n) {
        name = n;
    }

   public void eat() {
        System.out.println("animal class");
    }
    

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " cat is meow");
    }
    
}
public class Smallcat extends Cat{
   public Smallcat(String name){
    super(name);
    
   }
   public void weeping(){
    System.out.println(name+"small cat is weeping");
   }
}
}

