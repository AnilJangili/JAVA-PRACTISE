import java.util.*;
class Bank
{
String name;
long accountno;
String accounttype;
Scanner sc=new Scanner (System.in);
void input()
{

System.out.println("Enter name");
name=sc.next();
System.out.println("Enter account no");
accountno=sc.nextLong();
System.out.println("Enter account type");
accounttype=sc.next();
}
void display()
{
    System.out.println(name+accountno+accounttype);
}
}
class Currentaccount extends Bank
{
    double balance=100;
   // System.out.println("Enter total balanace");
    //balance=sc.nextDouble();
    void deposit1()
    {
    double deposit;
    System.out.println("Enter deposit amount");
    deposit=sc.nextDouble();
    balance=balance+deposit;
    System.out.println(balance);
    }
    void withdraw()
    {
        double withdraw;
        System.out.println("Withdraw amount");
        withdraw=sc.nextDouble();
        if(withdraw>balance)
        {
            System.out.println("Withdraw the amount");
        }
        else
        {
            balance=balance-withdraw;
            System.out.println("remaining balanace amount"+balance);
            //System.out.println("No");
        }
    }
}
class Account
{
    public static void main(String args[])
    {
        Currentaccount ac=new Currentaccount();
        ac.input();
        ac.display();
        ac.deposit1();
        ac.withdraw();
    }
}



