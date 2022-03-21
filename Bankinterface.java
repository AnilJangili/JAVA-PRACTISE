interface  Bank
{
     void rateofintrest();
}
class Sbi implements Bank
{
   public void rateofintrest()
    {
        System.out.println("SBI Rate of Intrest is 6%");
    }
}
class Union implements Bank
{
   public void rateofintrest()
    {
        System.out.println("UNION Bank Rate of Intrest is 7%");
    }
}
class Axis implements Bank
{
   public void rateofintrest()
    {
        System.out.println("AXIS Bank Rate of Intrest is 8%");
    }
}
class Bankinterface
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