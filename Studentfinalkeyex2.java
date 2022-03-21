
//final with class---we can not inherit that class

  final class Student
{
int rollno=123;
 void display()
{
System.out.println("display");
}
}

class Studentfinalkeyex2
{
public static void main(String args[])
{
Student s=new Student();
s.rollno=345;
s.display();
System.out.println(s.rollno);
}
}
