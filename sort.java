import java.util.*;
class sorting
{
public static void main(String args[])
{
int i,j,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(i=0;i<n;i++)
{
System.out.println(a[i]+"");
}
}
}

