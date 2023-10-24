package Aggregation_hasA;

public class Main {
    public static void main(String[] args) {
       // Mobile android=new Mobile(128, 6, "palstic", "black");
       //// Mobile iphone=new Mobile(256,4,"Metal","white");
        //Android M31=new Android("galaxy m31", 15000, 100, "samsung");
        //Iphone x=new Iphone("X", 45000, 137, "Iphone");
//x.display(iphone);
//M31.display(android);
Publisher p1=new Publisher("abc", "a517", "usa");
Publisher p2=new Publisher("xyz", "xyz12", "india");
Author a1=new Author("Denis Richee", "ca");
Author a2= new Author("R.k", "Delhi");
Book b1=new Book("Let us c", 800, p1, a1);
Book b2=new Book("Let us c", 500, p2, a2);
b1.display();
b2.display();

    }
    
}
