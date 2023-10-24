package Polymorphism.Method_overloading;
//Static method 

public class Adder {
     static int a,b,c;
    public static int add(int a1,int b1){
        a=a1;
        b=b1;
        return a1+b1;

    }
    static void add(int x ,int y,int z){
         a=x;
         b=y;
         c=z;
    }
public static void  display(){
    System.out.println(a+" "+b+" "+c);
}
static String add(String n,String m){
    return n+m;
}
    }
    

