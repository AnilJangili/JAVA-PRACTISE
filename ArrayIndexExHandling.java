//Example:ArrayIndexOutOfBoundsException
import java.util.*;
public class ArrayIndexExHandling
{
public static void main(String[] args) {
int a[]={1,4,6,7,8};
try{
System.out.println(a[6]);
}
catch(Exception e){
    System.out.println(e);
}
System.out.println("WELCOME");
}
}
