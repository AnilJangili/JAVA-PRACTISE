/*create bean class Employee

declare private variables eid,ename,esalary

setters and getters

main class create 2 objects*/
import java.util.*;
class Employee
{
private int eid;
private String ename;
private int esalary;
void setEid(int eid)//set the values
{
    this.eid=eid;
}
void setEname(String ename)
{
    this.ename=ename;
    }
void setEsalary(int esalary)
{
    this.esalary=esalary;
}
int getEid()//get the values
{
    return this.eid;
}
String getEname()
{
    return this.ename;
}
int getEsalary()
{
    return this.esalary;
}
}
class Employeebyencapsule
{
    public static void main(String args[])
    {
        Employee e1=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter eid");
        int i=sc.nextInt();
        e1.setEid(i);
        System.out.println("Enter Name");
        String n=sc.next();
        e1.setEname(n);
        System.out.println("Enter Salary");
        int s=sc.nextInt();
        e1.setEsalary(s);
        System.out.println(e1.getEid());
        System.out.println(e1.getEname());
        System.out.println(e1.getEsalary());
        Employee e2=new Employee();
         System.out.println("Enter eid");
        int i1=sc.nextInt();
        e2.setEid(i1);
        System.out.println("Enter Name");
        String n1=sc.next();
        e2.setEname(n1);
        System.out.println("Enter Salary");
        int s1=sc.nextInt();
        e2.setEsalary(s1);
        System.out.println(e2.getEid());
        System.out.println(e2.getEname());
        System.out.println(e2.getEsalary());
       
    }
}