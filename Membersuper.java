class Members
{
String name;
int age;
long phno;
String address;
double salary;


void salary()
{
    System.out.println("Salary of the members"+salary);
}
}
class Employee extends Members
{
    void data()
    {
    String specalization="TL";
    String department="IT";
    System.out.println("Specalization:"+specalization+"\ndepartment:"+department);
}
}
class Manager extends Members
{
void data1()
{
     String specalization="Project manager";
    String department="IT";
     System.out.println("Specalization:"+specalization+"\ndepartment:"+department);
}
}
class Membersuper
{
    public static void main(String args[])
    {
        Manager m=new Manager();
        System.out.println("----------Manager Info---------------");
        m.name="Anil";
        m.age=25;
        m.phno=12345;
        m.address="WARANGAL";
        m.salary=60000;
         System.out.println("Name:"+m.name+"\nAge:"+m.age+"\nPhNo:"+m.phno+"\nAddress:"+m.address+"\nsalary:"+m.salary);
        m.data1();
        
        Employee e=new Employee();
         System.out.println("----------Employee Info---------------");
         e.name="Raju";
         e.age=25;
         e.phno=15432;
         e.address="WGL";
         e.salary=50000;
          System.out.println("Name:"+e.name+"\nAge:"+e.age+"\nPhNo:"+e.phno+"\nAddress:"+e.address+"\nsalary:"+e.salary);
    
        e.data();
        
    }
}