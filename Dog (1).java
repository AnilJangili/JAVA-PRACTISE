
//Dog details program
class Details
{
    String name;
    String color;
    String bread;
    String eyecolor;
    void barkmethod()
    {
        System.out.println(name+"barking");
    }
    void eat()
    {
        System.out.println(name+"eating");
        
    }
}
    class Dog
    {
    public static void main (String args[])
    {
        Details dog1=new Details();
        dog1.name="Rocky";
        dog1.color="White";
        dog1.bread="German Shepord";
        dog1.eyecolor="light yellow";
        dog1.barkmethod();
        dog1.eat();
        System.out.println("------Dog1 Information-----------");
        System.out.println(dog1.name+dog1.color+dog1.bread+dog1.eyecolor);
         Details dog2=new Details();
        dog2.name="Leo";
        dog2.color="black";
        dog2.bread="bulldog";
        dog2.eyecolor="white";
        dog2.barkmethod();
        dog2.eat();
        System.out.println("------------Dog2 Information------------");
        System.out.println(dog2.name+dog2.color+dog2.bread+dog2.eyecolor);
    
        
    }
}