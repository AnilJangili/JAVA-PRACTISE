class Members
{
String name="aaa";
int age=22;
long phno=1234;
String address="wgl";
double salary=2000;

void printsalary()
{
    System.out.println("Salary of the members"+salary);
}
void display()
{
    System.out.println(name+age+phno+address+salary);
}
}
class Employee extends Members
{
    String name="sss";
int age=23;
int phno=77866;
String address="mulug";
int salary=4000;

    String specalization="TL";
    String department="IT";
{
   // super();
    System.out.println(name+age+phno+address+salary);
}
}
class Manager extends Employee
{
    String name="cccc";
int age=33;
int phno;
String address="bsp";
int salary=5008;

    void display1()
{
   // super();
    System.out.println(super.name+super.age+super.phno+super.address+super.salary);
}
}
class Membersuperex
{
    public static void main(String args[])
    {
        Manager m=new Manager();
        m.display1();
        m.display();
    }
}