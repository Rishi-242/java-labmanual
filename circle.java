import java.util.*;
class cir
{
int rad;
void getArea(int r)
{
rad=r;
System.out.println("area of circle"+3.14*+rad*+rad);
}
void getPerimeter(int r)
{
rad=r;
System.out.println("perimeter of circle"+2*+3.14*+rad);
}
}
class circle
{
public static void main(String args[])
{
cir d=new cir();
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the radius of the circle");
a=sc.nextInt();
d.getArea(a);
d.getPerimeter(a);
}
}
