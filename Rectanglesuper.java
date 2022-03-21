class Rectangle
{
    float length=5;
    float breadth=6;

Rectangle()
{
    this.length=length;
    this.breadth=breadth;
}
void area1()
{
   float area=length*breadth;
   System.out.println("Area of Rectangle::"+area);
}
void perimeter1()
{
    float perimeter=2*(length*breadth);
    System.out.println("Perimeter of Rectangle:"+perimeter);
}
}
class Square extends Rectangle
{
    
  /*  Square()
    {
        
        super ();
        
    }*/
    float side=4;
    void area2()
    {
    float sarea=side*side;
    System.out.println("Area of Square::"+sarea);
}
 float length=4;
    void perimeter2()
    {
    float perimeter2=4*length;
    System.out.println("Perimeter of Square::"+perimeter2);
    }
}
class Rectanglesuper
{
    public static void main(String args[])
    {
        Square s=new Square();
       s.area1();
        s.perimeter1();
        s.area2();
        s.perimeter2();
    }
}