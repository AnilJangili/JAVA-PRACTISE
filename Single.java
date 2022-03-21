 class Employee
{
int empid;
String name;
int salary;
String DOB;
double HRA()
{
double hra=(salary*20)/100;
return hra;
}
}
class Manager extends Employee
{
double DA()
{
double da=(salary*10)/100;
return da;
}
}

class Single
{
public static void main(String args[])
{
Manager Anil=new Manager();
Anil.salary=20000;
System.out.println(Anil.salary);
double hr=Anil.HRA();
System.out.println(hr);
double d=Anil.DA();
System.out.println(d);
double grosssalary=Anil.salary+d+hr;
System.out.println(grosssalary);
}
}
