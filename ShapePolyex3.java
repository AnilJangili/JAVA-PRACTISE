class Shape
{
     void draw(int l,int b)
    {
        System.out.println("Area of Rectangle is:"+l*b);
    }
     void draw(int s)
    {
        System.out.println("Area of square is:"+ 4*s);
    }
     void draw (int s1,int s2,int s3)
    {
        System.out.println("Area of Triangle is:"+ (0.5*s2*s3));
    }
}
class ShapePolyex3
{
    public static void main(String args[])
    {
        Shape s=new Shape();
        s.draw(2,9);
        s.draw(8);
        s.draw(7,4,11);
    }
}