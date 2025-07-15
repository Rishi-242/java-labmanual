import java.util.*;
class addmatrix
{
public static void main(String args[])
{
int r1,c1,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the 1st matrix");
r1=sc.nextInt();
System.out.println("enter the size of the 2nd matrix");
c1=sc.nextInt();
int a[][]=new int[r1][c1];
int b[][]=new int[r1][c1];
int c[][]=new int[r1][c1];
System.out.println("enter the elements of matrix 1st:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("ente the elements of matrix 2nd:");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
System.out.println();
}
System.out.println("ADDITION OF MATRIX");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.println(c[i][j]+"");
}
System.out.println();
}}
}
