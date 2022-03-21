import java.util.*;
class Student
{
private int rollno;
private String name;
private String section;
void setRollno(int rollno)//set the values for private datamembers
{
this.rollno=rollno;
}
void setName(String name)
{
this.name=name;
}
void setSection(String section)
{
this.section=section;
}
//to get the private variables
int getRollno()
{
return this.rollno;
}
String getName()
{
return this.name;
}
String getSection()
{
return this.section;
}
}

class Studentdetails
{
public static void main(String args[])
{
Student s=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter a rollno");
int r=sc.nextInt();
s.setRollno(r);
System.out.println("enter name");
String n=sc.next();
s.setName(n);
System.out.println("enter section");
String s1=sc.next();
s.setSection(s1);
System.out.println(s.getRollno());
System.out.println(s.getName());
System.out.println(s.getSection());
}
}
