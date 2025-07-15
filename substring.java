import java.util.*;
class sub
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s1=sc.nextLine();
System.out.println("enter the substring to be search");
String s2=sc.nextLine();
int i=s1.indexOf(s2);
if(i!=-1)
{
int str=s1.indexOf(s2);
System.out.println("substring is found"+ str);
}
else
{
System.out.println("substring is not found");
}
if(s1.startsWith(s2))
{
System.out.println("substring is  not found in main string");
}
else
{
System.out.println("substring is  found in main string");
}
}
}
