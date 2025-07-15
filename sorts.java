import java.util.*;
class sortnames
{
public static void main(String args[])
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of names");
n=sc.nextInt();
sc.nextLine();
String str[]=new String[n];
System.out.println("enter the names");
for(i=0;i<n;i++)
{
str[i]=sc.nextLine();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(str[i].compareTo(str[j])>0)
{
String temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.println("sorted names");
for(i=0;i<n;i++)
{
System.out.println(str[i]);
}
}
}
