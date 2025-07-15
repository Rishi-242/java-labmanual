import java.util.*;
class ignore
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2;
System.out.println("enter the first name");
s1=sc.nextLine();
System.out.println("enter the second name");
s2=sc.nextLine();
if(s1.equalsIgnoreCase(s2))
{
System.out.println("two strings are equal");
}
else{
System.out.println("two strings are not equal");
}
/*else
{
System.out.println("the two strings are equal");
}*/
}
}
