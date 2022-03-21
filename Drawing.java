abstract class Shape{
abstract void draw();
}
class Circle extends Shape{
void draw()
{
System.out.println("circle");
}
}
class Square extends Shape
{
void draw()
{
System.out.println("Square");
}
}
class Rectangle extends Shape{
void draw()
{
System.out.println("Rectangle");
}
}
class Drawing
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