import java.util.Scanner;
class Max2
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a character");
        ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch)
        {
        System.out.println("num1 is max");
        }
        else
        {
            System.out.println("num2 is  max");
        }
    }
}