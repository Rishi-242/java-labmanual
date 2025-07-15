import java.util.*;
class account
{
static int balance=100;
String name;
int account_no;
int withdraw;
int deposit;
void withdraw(String n,int a)
{
name=n;
withdraw=a;
if(balance<a)
{
System.out.println("withdraw is not possible ");
}
else
{
balance=balance-withdraw;
System.out.println("balance is "+balance);
}
}
void deposit(String n,int c)
{
name=n;
deposit=c;
balance=balance+c;
System.out.println("balance is "+balance);
}
public static void main(String args[])
{
int w,d,ac;
String ns;
account b=new account();
Scanner s=new Scanner(System.in);
System.out.println("enter the name");
ns=s.nextLine();
System.out.println("enter the withdraw,deposit,account number,values");
w=s.nextInt();
d=s.nextInt();
ac=s.nextInt();
System.out.println("name is "+ns);
System.out.println(balance);
b.withdraw(ns,w);
b.deposit(ns,d);
}
}
