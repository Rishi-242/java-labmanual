import java.util.*;
class muli
{
public static void main(String args[])
{
int r1,c1,r2,c2,i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter the values of 1st matrix");
r1=sc.nextInt();
c1=sc.nextInt();
System.out.println("enter the values of 2nd matrix");
r2=sc.nextInt();
c2=sc.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c2];
if(r1==c2)
{
System.out.println("enter the elements of 1st matrix");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("enter the elements of 2nd matrxi");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
c[i][j]=0;
for(k=0;k<c1;k++)
{
c[i][j]=c[i][j]+a[i][k]*b[k][j];
}
}
}
System.out.println("the multiplication matrtx");
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
System.out.println(c[i][j]);
}
}
}
else
{
System.out.println("multiplication is not possible");
}
}
}
