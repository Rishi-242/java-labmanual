import java.util.*;
class primefactor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int number=sc.nextInt();
System.out.println("prime factors of :"+number);
findPrimeFactors(number);
}
static  void findPrimeFactors(int n)
{
while(n%2==0)
{
System.out.println(2+"");
n=n/2;
}
for(int i=3;i<=Math.sqrt(n);i=i+2)
{
while(n%i==0)
{
System.out.println(i+"");
n=n/i;
}
}
if(n>2)
{
System.out.println(n);
}
}
}


