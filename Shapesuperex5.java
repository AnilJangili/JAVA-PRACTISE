class Shape
{
    void method1()
    {
        System.out.println("This is Shape");
    }
}
class Rectangle extends Shape
{
    void method2()
    {
        System.out.println("This is Rectangle Shape");
    }
}
class Circle extends Shape
{
    void method3()
    {
        System.out.println("This Circle Shape");
    }
}
class Square extends Rectangle
{
    void method4()
    {
        System.out.println("Square is not a Rectangle");
    }
}
class Shapesuperex5
{
    public static void main(String args[])
    {
        Square s=new Square();
        s.method2();
        s.method1();
    }
}