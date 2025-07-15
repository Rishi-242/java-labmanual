import java.util.*;
class account
{
String accountnumber;
String accountaddress;
String accountname;
int balance;
void insertVal(String acn,String acadd,String ana,int b)
{
accountnumber=acn;
accountaddress=acadd;
accountname=ana;
balance=b;
}
void withdraw(int b,int am)
{
if(b>=am)
{
b=b-am;
System.out.println(" balence after withdraw:"+b);
}
else
{
System.out.println("sufficent to withdraw:"+b);
}}
void deposite(int b,int am)
{
b=b+am;
System.out.println("balence after deposite:"+b);
}
void getdetailes(String number,String address,String name,int balance)
{
System.out.println("accountnumber:"+accountnumber);
System.out.println("accountaddress:"+accountaddress);
System.out.println("name:"+name);
System.out.println("balance:"+balance);
}
public static void main(String args[])
{
account s=new account();
int b,a,e;
String name,address,number;
Scanner sc=new Scanner(System.in);
System.out.println("enter the detailes of name,address,number");
name=sc.nextLine();
address=sc.nextLine();
number=sc.nextLine();
System.out.println("enter the initial balance");
a=sc.nextInt();
s.insertVal(number,address,name,a);
s.getdetailes(number,address,name,a);
System.out.println("enter the withdraw amount");
b=sc.nextInt();
s.withdraw(a,b);
System.out.println("enter the deposite balance");
e=sc.nextInt();
s.deposite(a,e);
}}


