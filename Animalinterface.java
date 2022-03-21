interface Animal 
{
    abstract void eat();
}
class Dog implements Animal
{
   public void eat()
    {
    System.out.println("Dog is eating biscuits");
    }
}
class Cat implements Animal
{
   public void eat()
    {
    System.out.println("Cat is eating biscuits");
    }
}
class Animalinterface
{
    public static void main(String args[])
    {
        Animal d=new Dog();
        d.eat();
        Animal c=new Cat();
        c.eat();
    }
}