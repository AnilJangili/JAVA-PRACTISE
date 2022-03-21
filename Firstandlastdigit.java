import java.util.*;
class Firstandlastdigit
{
    public static void main(String abc[])
    {
        int n,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        int lastdigit=n%10;
    
        while(n>=9)
        {
            n=n/10;
        
        }
        int firstdigit=n;
        System.out.println(firstdigit);
        System.out.println(lastdigit);
   
   
       
        
    }
}