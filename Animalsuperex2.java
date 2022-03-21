class Animal
{
String color="black";
String bread;
}
class Dog extends Animal
{
String color="red";
void display()
{
System.out.println(super.color);
}
void bark()
{
System.out.println("barking..........");
}
}


class Animalsuperex2
{
public static void main(String args[])
{
Dog d=new Dog();
//d.color="red";
d.bread="jarman";
//d.display1();
d.display();
System.out.println(d.color);
}
}