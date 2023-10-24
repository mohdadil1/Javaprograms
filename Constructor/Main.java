package Constructor;
public class Main {
    public static void main(String[] args) {
        Student s1=new Student(111,"adil");
        Student s2=new Student(222,"aquib",24);
        s1.display();
        Student s3=new Student(s2,s1);
        s3.display();
       // Bike b1=new Bike();
    }
    
}
