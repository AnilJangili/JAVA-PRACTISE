class Rectangle
{
double length,breadth;
Rectangle(double length,double breadth)
{
this.length=length;
this.breadth=breadth;
}
void area()
{
System.out.println((length*breadth));
}
void perimeter()
{
System.out.println((2*(length+breadth)));
}
}
class Square extends Rectangle
{
Square(double side)
{
super(side,side);
}
}
class Rectanglesuperex
{
public static void main(String args[])
{
Square s=new Square(2);
Rectangle r=new Rectangle(2,3);
System.out.println("Square");
s.area();
s.perimeter();
System.out.println("Rectangle");
r.area();
r.perimeter();
}
}