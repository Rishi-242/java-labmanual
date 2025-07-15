import java.util.*;
class student
{ 
int id;
String name;
static String collage="rgukt";
student(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+""+name+""+collage);
}
public static void main(String args[])
{
student s1=new student(1,"rishi");
student s2=new student(2,"geetha");
student s3=new student(3,"ammu");
s1.display();
s2.display();
s3.display();
}
}
