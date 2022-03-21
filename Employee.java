//Employee Details
class Details
{
    int eid;
    String ename;
    String edpt;
    float esalary;
    String eaddress;
     void  calculate()
    {
        if (esalary>10000 && esalary<20000)
        {
       float HRA=(esalary)*25/100;
       float DA=(esalary)*45/100;
        float grosssalary=esalary+HRA+DA;
        System.out.println(ename + grosssalary);
    }
    else if (esalary>20000 && esalary<40000)
    {
       float HRA=(esalary)*25/100;
       float DA=(esalary)*20/100;
       float grosssalary=esalary+HRA+DA;
         System.out.println(ename+grosssalary);
    
  }
   else
    {
        float HRA=(esalary)*30/100;
       float DA=(esalary)*30/100;
       float grosssalary=esalary+HRA+DA;
        System.out.println(ename+grosssalary);
    }
    }
}
    class Employee
    {
    public static void main (String args[])
    {
        Details emp11=new Details();
        emp11.eid=11;
        emp11.ename="Anil";
        emp11.edpt="IT";
        emp11.esalary=15000;
        emp11.eaddress="Warangal";
       emp11.calculate();
        System.out.println("Employee1 Information:");
        System.out.println(emp11.eid+emp11.ename+emp11.edpt+emp11.esalary+emp11.eaddress);
       Details emp12=new Details();
        emp12.eid=12;
        emp12.ename="Santhosh";
        emp12.edpt="IT";
        emp12.esalary=55000;
        emp12.eaddress="Warangal";
       emp12.calculate();
        System.out.println("Employee2 Information:");
        System.out.println(emp12.eid+emp12.ename+emp12.edpt+emp12.esalary+emp12.eaddress);
    
        
    }
}