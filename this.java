import java.util.*;
class student
{
int id;
String name;
void insertval(int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id+""+name);
}
public static void main(String atgs[])
{
student s=new student();
int a;
String b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the id and name of the student");
a=sc.nextInt();
b=sc.nextLine();
s.insertval(a,b);
//s.insertval(b);
}
}
