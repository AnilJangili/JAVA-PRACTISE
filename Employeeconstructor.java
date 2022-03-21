//Employee details using constructor
import java.util.*;
class Details
{
    int eid;
    String ename;
    String edpt;
    float esalary;
    String eaddress;
   //constructor using this key word
   Details(int eid,String ename,String edpt,float esalary,String eaddress)
   {
       this.eid=eid;
       this.ename=ename;
       this.edpt=edpt;
       this.esalary=esalary;
       this.eaddress=eaddress;
   }
   Details(int eid,String ename,String edpt, float esalary)
   {
        this.eid=eid;
       this.ename=ename;
       this.edpt=edpt;
       this.esalary=esalary;
   }
   Details(int eid,String ename,String edpt)
   {
        this.eid=eid;
       this.ename=ename;
       this.edpt=edpt;
   }
   Details(int eid,String ename)
   {
      this.eid=eid;
       this.ename=ename;  
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
    class Employeeconstructor
    {
    public static void main (String args[])
    {
        Details emp11=new Details(111,"Anil","IT",50000,"WARANGAL");
       // emp11.input();
         System.out.println("----------------Employee11 Information:--------------");
        emp11.display();
        emp11.calculate();
        Details emp12=new Details(222,"Santhosh","IT",25000);
        System.out.println("------------------Employee22 Information:----------------");
        emp12.display();
        emp12.calculate();
         Details emp13=new Details(333,"Raju","Non-IT");
        System.out.println("----------------Employee3 Information:-------------------");
        emp13.display();
        emp13.calculate();
          Details emp14=new Details(444,"Revanth");
        System.out.println("-----------------Employee4 Information:---------------------");
        emp14.display();
        emp14.calculate();
    }
}