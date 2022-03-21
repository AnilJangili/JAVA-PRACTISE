/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class
class Teacher
{
     String collegeName="VCET";
     String designation="IIT";
     void work()
     {
          System.out.println("Teacher");
     }
}
//Add MathTeacher class
class MathTeacher extends Teacher
{

void display()
{
System.out.println("MathTeacher"+"         "+designation);
}
}
//Add EnglishTeacher class
class EnglishTeacher extends Teacher
{

void display()
{
System.out.println("EnglishTeacher"+"        "+designation);
}
}
//Add MusicTeacher class
class MusicTeacher extends Teacher
{

void display()
{
System.out.println("MusicTeacher"+"           "+designation);
}
}
class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
public static void main(String args[])
{
     MathTeacher m=new MathTeacher();
    //m.work();
    m.display();
     EnglishTeacher e=new EnglishTeacher();
     e.display();
     MusicTeacher mt=new MusicTeacher();
     mt.display();
}

}