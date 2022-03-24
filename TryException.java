import java.util.*;
public class TryException
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int a=sc.nextInt();
System.out.println("Enter b value");
int b=sc.nextInt();
int ab[]={1,3,4};
try {
System.out.println((a/b));
ab[6]=5;
}
/*catch(ArithmeticException e)
{
System.out.println(e);
}*/
catch(StringIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}


}
}