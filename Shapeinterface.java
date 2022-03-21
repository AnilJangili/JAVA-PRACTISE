interface Shape{
    int side=1; //public static final int side=1(JVM reffered )
abstract void draw();
}
class Circle implements Shape{
public void draw()
{
System.out.println("circle");
}
}
class Square implements Shape
{
public void draw()
{
System.out.println("Square");
}
}
class Rectangle implements Shape{
public void draw()
{
System.out.println("Rectangle");
}
}
class Shapeinterface
{
public static void main(String args[])
{
Shape c=new Circle();
c.draw();
Shape s=new Square();
s.draw();
Shape r=new Rectangle();
r.draw();
}
}