package Constructor;
public class Student {
    int id;
    String name;
    int age;
    //parameterized constructor
    public Student(int i,String n){
        id=i;
        name=n;

    }
    //constructor overloading
    public Student(int i ,String n,int a ){
        id=i;
        name=n;
        age=a;

    }
    //copy constructor
    public Student(Student s1,Student s2){
        age=s1.age;
        id=s2.id;
        name=s2.name;
    }
    public void display(){
        System.out.println(id+" "+name+" "+age);
    }
    
}
