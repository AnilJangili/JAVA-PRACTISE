//person eligible for blood donation or not
import java.util.Scanner;
class Blood
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int age,weight;
    System.out.println("enter age");
     age=sc.nextInt();
     System.out.println("enter weight");
     weight=sc.nextInt();
    if(age>=18&&weight>=50)
    {
        System.out.println("eligible for Blood donation");
    }
    else
    {
         System.out.println("not eligible for Blood donation"); 
    }
    
    }
}

