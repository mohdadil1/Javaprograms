package Aggregation_hasA;
 class Book {
    String name;
    int price;
    Publisher pub;
    Author au;
    Book(String n,int p,Publisher pu,Author a){
        this.name=n;
        this.price=p;
        this.au=a;
        this.pub=pu;

    }
    public void display(){
        System.out.println("Book name"+" "+name);
        System.out.println("Book price"+" "+price);
        System.out.println("Book author name"+" "+au.name);
        System.out.println("Book author place"+" "+au.place);
        System.out.println("Book publisher name"+" "+pub.name);
        System.out.println("Book publisher ID"+" "+pub.publisherID);
        System.out.println("Book publisher City"+" "+pub.city);
    }
    
}
