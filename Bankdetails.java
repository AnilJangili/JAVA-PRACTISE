abstract class Bank
{
    abstract void rateofintrest();
}
class Sbi extends Bank
{
    void rateofintrest()
    {
        System.out.println("SBI Rate of Intrest is 6%");
    }
}
class Union extends Bank
{
    void rateofintrest()
    {
        System.out.println("UNION Bank Rate of Intrest is 7%");
    }
}
class Axis extends Bank
{
    void rateofintrest()
    {
        System.out.println("AXIS Bank Rate of Intrest is 8%");
    }
}
class BankDetails
{
    public static void main(String args[])
    {
        Bank s=new Sbi();
        s.rateofintrest();
         Bank u=new Union();
        u.rateofintrest();
         Bank a=new Axis();
        a.rateofintrest();
    }
}