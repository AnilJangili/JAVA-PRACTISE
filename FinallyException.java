import java.util.*;
public class FinallyException
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int a=sc.nextInt();
System.out.println("Enter b value");
int b=sc.nextInt();

try
{
System.out.println((a/b));
}
catch(Exception e)
{
System.out.println(e);
}

finally{
    System.out.println("Finally block is executed");
}
}
}