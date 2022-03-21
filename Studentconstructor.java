import java.util.*;
class Details
{
    String sname;
    int srollno;
    String ssection;
    float sinternal_marks;
    float external_marks;
    float sproject_marks;
  Details(String sname,int srollno, String ssection, float sinternal_marks, float external_marks,  float sproject_marks)
  {
       this. sname=sname;
    this.srollno=srollno;
    this. ssection=ssection;
    this. sinternal_marks=sinternal_marks;
    this. external_marks=external_marks;
    this. sproject_marks=sproject_marks;
  }
  Details()
  {
      
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
class Studentconstructor
{
    public static void main(String args[])
    {
        Details std1=new Details("Anil",111,"A",88,78,98);
        
         System.out.println("-----------student1 details---------");
        std1.display();
        std1.grade();
         Details std2=new Details();
        
        System.out.println("-----------student2 details---------");
        std2.display();
         std2.grade();
        
    }
}
