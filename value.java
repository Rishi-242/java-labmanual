import java.util.*;
class Myclass
{
int value;
Myclass(int value)
{
this.value=value;
}
}
class CallByExample{
static void callByValue(int x)
{
x=20;
}
static void callByObject(Myclass obj)
{
obj.value=30;
}
//class tea{
public static void main(String args[])
{
int num=10;
callByValue(num);
System.out.println("call by value:"+num);
Myclass myObject=new Myclass(25);
callByObject(myObject);
System.out.println("call  by object:"+myObject.value);
}
}

