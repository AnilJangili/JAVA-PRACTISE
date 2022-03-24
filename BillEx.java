/* 4. Write a program to Calculate Electricity Bill. Accept last month units and present units in string format from the user. 
      Calculate Electricity Bill for last month units, otherwise throw ArithementicException along with some error message.  
      Handle NumberFormatException while converting units into numerical value. 

  Calculate Electricity Bill based on following charges:

  ==> first 50 units charges are: 0.50 per/unit
  ==> next 100 units charges are: 1.75 per/unit
  ==> next 100 units charges are: 2.50 per/unit
  ==> above 250 units charges are: 2.90 per/unit

  Add 10% surcharge on overall bill.

*/
import java.util.*;
 class Electricity {
     Scanner sc=new Scanner(System.in);
     public void bill()
     {
    String reading,newreading;
    double units,charge;
    System.out.println("old reading");
reading=sc.next();
System.out.println("Newreading");
newreading=sc.next();
int reading1=0;
int newreading1=0;
try{
   reading1 = Integer.parseInt(reading);
   newreading1=Integer.parseInt(newreading);
}
catch(Exception e){
    System.out.println(e);
}
 units=newreading1-reading1;
System.out.println(units);

System.out.println("Enter value");
int n=sc.nextInt();
switch(n)
{
    case 1:
    {
        if(units >50 && units<100)
        {
            charge=((units*0.50)+10/100);
            System.out.println(charge);
        }
      else{
            throw new StringIndexOutOfBoundsException("error");
      }
        break;
    }
    case 2:
    {
        
        if(units>=50 && units<100)
        {
            charge=((units*1.75)+10/100);
            System.out.println(charge);
        }
        break;
    }
    case 3:
    {
        
        if(units>=100 && units<200)
        {
            charge=((units*2.50)+10/100);
            System.out.println(charge);
        }
        break;
        }
        case 4:
        {
        
        if(units>250)
        {
            charge=((units*2.90)+10/100);
            System.out.println(charge);
        }
        break;
    }
    
    }
}
}
class BillEx
{
    public static void main(String args[]) {
        Electricity eb=new Electricity();
        eb.bill();

    }
}
