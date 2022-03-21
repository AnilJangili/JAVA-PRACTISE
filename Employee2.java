//Employee details using Scanner
import java.util.*;
class Details
{
    int eid;
    String ename;
    String edpt;
    float esalary;
    String eaddress;
    void input()
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter id");
       eid=sc.nextInt();
        System.out.println("enter name");
        ename=sc.next();
        System.out.println("enter Dpt");
        edpt=sc.next();
        System.out.println("enter salary");
        esalary=sc.nextFloat();
        System.out.println("enter address");
        eaddress=sc.next();
    }
    void display()
    {
        System.out.println("Id:"+eid+"\nName:"+ename+"\nDpt:"+edpt+"\nSalary:"+esalary+"\nAddress:"+eaddress);
    }
     void  calculate()
    {
        if (esalary>10000 && esalary<20000)
        {
       float HRA=(esalary)*25/100;
       float DA=(esalary)*45/100;
        float grosssalary=esalary+HRA+DA;
        System.out.println(ename +"\nGrosssalary:"+ grosssalary);
    }
    else if (esalary>20000 && esalary<40000)
    {
       float HRA=(esalary)*25/100;
       float DA=(esalary)*20/100;
       float grosssalary=esalary+HRA+DA;
         System.out.println(ename+"\nGrosssalary:"+grosssalary);
    
  }
   else
    {
        float HRA=(esalary)*30/100;
       float DA=(esalary)*30/100;
       float grosssalary=esalary+HRA+DA;
        System.out.println(ename+"\nGrosssalary:"+grosssalary);
    }
    }
}
    class Employee2
    {
    public static void main (String args[])
    {
        Details emp11=new Details();
        emp11.input();
         System.out.println("Employee11 Information:");
        emp11.display();
        emp11.calculate();
        Details emp12=new Details();
        emp12.input();
        System.out.println("Employee22 Information:");
        emp12.display();
        emp12.calculate();
        
    }
}