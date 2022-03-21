import java.util.Scanner;
class Leap
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Year");
        num=sc.nextInt();
       
        if(num%4==0)
        {
        System.out.println("given year is leap year");
        }
        
        else
        {
            System.out.println("given is not leap year");
        }
    }
}