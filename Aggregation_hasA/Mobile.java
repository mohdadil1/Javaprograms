package Aggregation_hasA;

 class Mobile {
     int Storage;
     int ram;
     String body;
     String color;
     
    public Mobile(int s,int r,String b,String c){
        this.Storage=s;
        this.ram=r;
        this.body=b;
        this.color=c;
    }
    
}
class Android{
    Mobile Mb;
    String name;
    String Model;
    double price;
    double weight;
     public Android(String m,double p,double w, String name){
        this.Model=m;
        this.price=p;
        this.weight=w;
        this.name=name;

    }
    public void display(Mobile Mb){
        System.out.println(name+"\n "+Model+"\n "+Mb.color+"\n "+Mb.body+"\n "+Mb.ram+"\n "+Mb.Storage+"\n "+weight+"\n "+price);
    }

}
 class Iphone {
       Mobile Mb;
    String name;
    String Model;
    double price;
    double weight;
     public Iphone(String m,double p,double w, String name){
        this.Model=m;
        this.price=p;
        this.weight=w;
        this.name=name;

    }
    public void display(Mobile Mb){
        System.out.println(name+"\n "+Model+" \n"+Mb.color+" \n"+Mb.body+"\n "+Mb.ram+" \n"+Mb.Storage+" \n"+weight+" \n"+price);
    }
 }
