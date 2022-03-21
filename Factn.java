//Factorial of a number using Static Keyword
class Factorial
{
    static void fact(int a)
    {
       int fact=1;
        for (int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
class Factn
{
    public static void main(String args[])
    {
        Factorial.fact(5);
    }
}