//Dog details using Scanner
import java.util.*;
class Details
{
    
    String name;
    String bread;
    String color;
    String eyecolor;
    void input()
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter name");
        name=sc.next();
        System.out.println("enter bread");
        bread=sc.next();
        System.out.println("enter color");
        color=sc.next();
        System.out.println("enter eyecolor");
        eyecolor=sc.next();
        
    }
    void display()
    {
        System.out.println("name:"+name+"\n bread:"+bread+"\ncolor:"+color+"\neyecolor:"+eyecolor);
    }
    
    void bark()
    {
        System.out.println(name+" barking");
    }
    void eat()
    {
        System.out.println(name+" eating");
    }
    
    
}
class Dog2
{
    public static void main(String args[])
    {
        Details dog1=new Details();
     
       dog1.input();
        System.out.println("dog 1 information");
        dog1.display();
        dog1.bark();
        dog1.eat();
        Details dog2=new Details();
        dog2.input();
        System.out.println("dog 2 information");
     dog2.display();
     dog2.bark();
     dog2.eat();
    }
}