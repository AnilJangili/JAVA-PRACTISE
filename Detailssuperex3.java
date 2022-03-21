class Animal
{
String color="black";
String bread;
Animal()
{
    this.color=color;
     System.out.println("Animal is created");
}
}
class Dog extends Animal
{
    Dog()
    {
        super();
        System.out.println("dog is created");
    }
String color="red";
/*void display()
{
System.out.println(super.color);
}*/
void bark()
{
System.out.println("barking..........");
}
}

class Detailssuperex3
{
public static void main(String args[])
{
Dog d=new Dog();
//d.color="red";
d.bread="jarman";
//d.display1();
//d.display();
System.out.println(d.color);
}
}