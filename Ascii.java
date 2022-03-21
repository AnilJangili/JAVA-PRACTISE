import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        char ch=sc.next().charAt(0);
        int v=(int)ch;
       for(int i=0;i<=255;i++)
       {
        System.out.println(v);
        return;
       }
    }
}