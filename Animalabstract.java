abstract class Animal 
{
    abstract void eat();
}
class Dog extends Animal
{
    void eat()
    {
    System.out.println("Dog is eating biscuits");
    }
}
class Cat extends Animal
{
    void eat()
    {
    System.out.println("Cat is eating biscuits");
    }
}
class Animalabstract
{
    public static void main(String args[])
    {
        Animal d=new Dog();
        d.eat();
        Animal c=new Cat();
        c.eat();
    }
}