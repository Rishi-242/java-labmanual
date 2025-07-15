import java.util.*;
class compare
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2;
System.out.println("enter the first name");
s1=sc.nextLine();
System.out.println("enter the second name");
s2=sc.nextLine();
int r=s1.compareTo(s2);
if(r>0)
{
System.out.println("the first string is smaller than second string");
}
else if(r<0)
{
System.out.println("the first string is greater tha second  string");
}
else
{
System.out.println("the two strings are equal");
}
}
}
