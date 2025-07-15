import java.util.*;
class student{
String name="dheekonda";
}
class B extends student
{
String name="rishitha";
void display()
{
System.out.println(name);
System.out.println(super.name);
}	
}
class A
{
public static void main(String args[])
{
B obj=new B();
obj.display();
}
}

