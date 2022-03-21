import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        int phy,che,bio,math,Comp,max_marks;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter phy marks");
        phy=sc.nextInt();
        System.out.println("Enter che marks");
        che=sc.nextInt();
         System.out.println("Enter bio marks");
        bio=sc.nextInt();
         System.out.println("Enter math marks");
        math=sc.nextInt();
         System.out.println("Enter Comp marks");
        Comp=sc.nextInt();
         System.out.println("Enter max_marks");
        max_marks=sc.nextInt();
        int total_marks=(phy+che+bio+math+Comp);
        System.out.println("total_marks"+total_marks);
        float percentage=(total_marks/max_marks)*100;
         System.out.println("Show Percentage"+percentage);
        
            if (percentage>=90)
            {
        System.out.println("Grade A");
        }
        else if (percentage>=80)
       
        {
            System.out.println("Grade B");
        }
        else if (percentage>=70)
        {
            System.out.println("Grade C");
        }
        else if (percentage>=60)
        {
        System.out.println("Grade D");
        }
       else if (percentage>=50)
        {
        System.out.println("Grade E");
        }
        else  if (percentage>=40)
        {
           
        System.out.println("Grade f");
        }
        else
        {
             System.out.println("Fail");
        }
    }
}