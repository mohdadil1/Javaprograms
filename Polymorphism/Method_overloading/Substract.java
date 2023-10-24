package Polymorphism.Method_overloading;
//non Static method

public class Substract {
    int a,b;
    float c,d;
    
    void sub(int x,int y){
        a=x;
        b=y;
    }
    void sub(float x,float y){
        c=x;
        d=y;
    }
    float sub(int x,float y){
        return y-x;

    }
    
    void display(){
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
    }
}
