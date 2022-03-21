class Shape
{
    static void draw(int l,int b)
    {
        System.out.println("Area of Rectangle is:"+l*b);
    }
    static void draw(int s)
    {
        System.out.println("Area of square is:"+ 4*s);
    }
    static void draw (int s1,int s2,int s3)
    {
        System.out.println("Area of Triangle is:"+ (0.5*s2*s3));
    }
}
class ShapePolyex2
{
    public static void main(String args[])
    {
        Shape.draw(2,5);
        Shape.draw(5);
        Shape.draw(3,4,5);
    }
}