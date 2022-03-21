import java.util.Scanner;
class Max3
{
    public static void main(String args[])
    {
        int num1,num2,num3;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter num1");
        num1=sc.nextInt();
        System.out.println("Enter num2");
        num2=sc.nextInt();
         System.out.println("Enter num3");
        num3=sc.nextInt();
        if(num1>=num2&&num1>=num3)
        {
        System.out.println("num1 is max");
        }
        else if (num2>=num1&&num2>=num3)
        {
            System.out.println("num2 is  max");
        }
        else
        {
            System.out.println("num3 is max");
        }
    }
}