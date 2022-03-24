/* 1. Write a program to accept two numbers, one Arithmetic operator such as +, -, / , *  and print output of Arithmetic operation. 
   Write switch case to perform each operation. Handle ArithmeticException when you are performing division operation. 
*/
import java.util.*;
 class Arithmetic {
int n,a,b;
public void viewoptions() {
System.out.println("\n1. addition");
System.out.println("2. Subtraction");
System.out.println("3. divisible");
System.out.println("4. multiplication");
Scanner sc=new Scanner (System.in);
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter b value");
b=sc.nextInt();
System.out.println("Enter n value");
n=sc.nextInt();
switch(n)
{
    case 1:{
    System.out.println("Addition");
    n=a+b;
    System.out.println(n);
    break;
    }
     case 2:{
    System.out.println("Subtraction");
    n=a-b;
    System.out.println(n);
    break;
}
     case 3:{
    System.out.println("Divisible");
    n=a/b;
    System.out.println(n);
    if(b==0){
        throw new StringIndexOutOfBoundsException("Not divisible");
    }
    else{
        System.out.println("Divisible");
    }
    break;
}
     case 4:{
    System.out.println("multiplication");
    n=a*b;
    System.out.println(n);
    break;
     }
    default:{
System.out.println("Invalid option");
}
}
}
}
class ArithmeticException{
    
    public static void main(String args[]) {
Arithmetic op=new Arithmetic();
try{
op.viewoptions();
    }
    catch(Exception e) {
System.out.println(e);
}
}
}