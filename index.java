import java.util.*;
class index
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first string");
String s1=sc.nextLine();
System.out.println(s1.length());
System.out.println("enter what you want in that string");
char A=sc.next().toLowerCase().charAt(0);
int count=0;
int vowel=0;
int c=0;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)==A)
{
count++;
}
}
System.out.println("count"+count);
}
}
