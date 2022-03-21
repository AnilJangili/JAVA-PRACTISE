class Calculator
{
    static void cube(int a)
    {
     int cube=a*a*a;
        System.out.println(cube);
    }
}
class Cube
{
    public static void main(String args[])
    {
        Calculator.cube(10);
    }
}