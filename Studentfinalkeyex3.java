//final with method----we can not override that method
class Student
{
 int rollno=123;
final void display()
{
System.out.println("display");
}
}
class Toppers extends Student
{
void display()//cant do
{
System.out.println("edit");
}
}
class Studentfinalkeyex3
{
public static void main(String args[])
{
Student s=new Student();
s.rollno=345;
s.display();
System.out.println(s.rollno);
}
}