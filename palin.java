import java.util.*;
class palindrome
{
public static void main(String args[])
{
int n,s=0,rem,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
int t=n;
while(n>0)
{
rem=n%10;
sum=sum+rem;
s=s*10+rem;
n=n/10;
}
if(s==t)
{
System.out.println("it is a palindrome");
}
else
{
System.out.println("it is n't a palindrome");
}
}
}

