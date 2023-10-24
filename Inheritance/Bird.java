package Inheritance;
//Hierarchical Inheritance
 class Bird {
    String name;
    public Bird(String n){
        name=n;

    }
public void eat(){
    System.out.println(name+ "eating");
}
    
}
 class Parrort extends Bird{
    public Parrort(String name){
        super(name);
    }
 public void mithu(){
    System.out.println(name+"tota class");
 }
}
class Pegion extends Bird{
    public Pegion(String name){
        super(name);
    }
    public void kabutar(){
        System.out.println(name+"kabutar class");
    }
}