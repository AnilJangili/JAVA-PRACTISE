//Student details by using Scanner
import java.util.*;
class Details
{
    String sname;
    int srollno;
    String ssection;
    float sinternal_marks;
    float external_marks;
    float sproject_marks;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        sname=sc.next();
        System.out.println("Enter Rollno:");
        srollno=sc.nextInt();
        System.out.println("Enter section");
        ssection=sc.next();
        System.out.println("Enter internal marks");
        sinternal_marks=sc.nextFloat();
        System.out.println("Enter External marks:");
        external_marks=sc.nextFloat();
        System.out.println("Enter project marks");
        sproject_marks=sc.nextFloat();
    }
    void display()
    {
    System.out.println("Name:"+sname+"\nRollno:"+srollno+"\nsection:"+ssection);
    }
     void  grade()
    {
    float total_marks=(sinternal_marks+ external_marks+sproject_marks);
    float max_marks=300;
   float percentage=(total_marks/max_marks)*100;
   System.out.println(percentage);
   
        if (percentage>=90 && percentage<=100)
            {
        System.out.println("Grade A");
        }
        else if (percentage>=80 && percentage<=90)
       
        {
            System.out.println("Grade B");
        }
        else if (percentage>=70 && percentage<=80)
        {
            System.out.println("Grade C");
        }
        else if (percentage>=60 && percentage<=70)
        {
        System.out.println("Grade D");
        }
       else if (percentage>=50 && percentage<=60)
        {
        System.out.println("Grade E");
        }
        else  if (percentage>=40 && percentage<=50)
        {
           
        System.out.println("Grade f");
        }
        else
        {
             System.out.println("Fail");
        }
    }
   
}
class Student2
{
    public static void main(String args[])
    {
        Details std1=new Details();
        std1.input();
         System.out.println("-----------student1 details---------");
        std1.display();
        std1.grade();
         Details std2=new Details();
        std2.input();
        System.out.println("-----------student2 details---------");
        std2.display();
         std2.grade();
        
    }
}
