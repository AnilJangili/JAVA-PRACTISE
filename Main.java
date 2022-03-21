//Student details example
class Student
{
    int rollno;
    String name;
    String section;
    String address;
    void reading()
    {
        System.out.println(name+"reading");
    }
    void writing()
    {
        System.out.println(name+"writing");
        
    }
}
    class Main
    {
    public static void main (String args[])
    {
        Student std1=new Student();
        std1.rollno=1;
        std1.name="Anil";
        std1.section="A";
        std1.address="Warangal";
        std1.reading();
        std1.writing();
        System.out.println("Student1 Information:");
        System.out.println(std1.rollno+std1.name+std1.section+std1.address);
         Student std2=new Student();
        std2.rollno=2;
        std2.name="Raju";
        std2.section="B";
        std2.address="Hyd";
        std2.reading();
        std2.writing();
        System.out.println("Student2 Information:");
        System.out.println(std2.rollno+std2.name+std2.section+std2.address);
    
        
    }
}