//Example:NumberFormatException
import java.util.*;
public class NumberExHandling
{
public static void main(String[] args) {
String s="Anil";
try{
int num=Integer.parseInt(s);
System.out.println(num);
}
catch(Exception e)
{
    System.out.println(e);
}
System.out.println("WelCome");
}
}

