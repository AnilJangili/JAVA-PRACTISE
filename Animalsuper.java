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
class cat extends Dog{
String color="white";
void display1()
{
System.out.println(super.color);
}
}
class Animalsuper
{
public static void main(String args[])
{
cat d=new cat();
//d.color="red";
d.bread="jarman";
d.display1();circle
d.display();
System.out.println(d.color);
}
}