import java.util.*;
class quadratic
{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
System.out.println("enter the coefficent a:");
double a=sc.nextDouble();
System.out.println("enter the coefficent b:");
double b=sc.nextDouble();
System.out.println("enter the coefficent c:");
double c=sc.nextDouble();
double d=b*b-4*a*c;
if(d>=0)
{
double r1=(-b+Math.sqrt(d))/(2*a);
double r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("real solution");
System.out.println("root 1:"+r1);
System.out.println("root 2:"+r2);
}
else
{
double rp=-b/(2*a);
double ip=Math.sqrt(-d)/(2*a);
System.out.println("imaginary roots");
System.out.println("root 1:"+rp+" " +ip+"i");
System.out.println("root 2:"+rp+" " +ip+"i");
}
}
}
