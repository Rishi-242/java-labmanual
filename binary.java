import java.util.*;
class binary{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,mid,n,t;
System.out.println("enter the size");
n=sc.nextInt();
System.out.println("enter the elements");
int a[]=new int[n];
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
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("sorted array");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
System.out.println("enter the key");
int key=sc.nextInt();
int index=binary(a,key);
if(index!=-1)
{
System.out.println("the index is present"+index);
}
else
{
System.out.println("the index is not present");
}
}
public  static  int binary(int a[],int key)
{
int i;
for(i=0;i<a.length;i++)
{
if(a[i]==key)
{
return 1;
}
}
return -1;
}
}
