/* 3. Write a program to accept firstName, lastName and mobileNumber in string format. 
   Print number of characters in firstName and lastName, and print sum of digits of a mobileNumber. 
   Handle NumberFormatException while converting mobileNumber to long.
*/
import java.util.*;
public class NumberFormatException {

    public static void main(String args[]) {
int digit,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter firstName:");
String fn=sc.next();
System.out.println("Enter lastname");
String ln=sc.next();
System.out.println("Enter mobileNumber");
String mobilenum=sc.next();
try{
    long num=Long.parseLong(ln);
}
catch(Exception e){
    System.out.println(e);
}
System.out.println("length of firstName is:"+fn.length());
System.out.println("length of lastName is:"+ln.length());
System.out.println("length of mobileNumber is:"+mobilenum.length());
}
    }
