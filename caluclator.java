import java.util.*;
class caluclator
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
double num1=sc.nextDouble();
System.out.println("enter second number");
double num2=sc.nextDouble();
System.out.println("enter the operator");
char operator=sc.next().charAt(0);
double result=0;
switch(operator)
{
case'+':
result=num1+num2;
break;
case'-':
result=num1-num2;
break;
case'*':
result=num1*num2;
break;
case'/':
if(num2!=0)
{
result=num1/num2;
}
else
{
System.out.println("cannot divide by zero");
return;
}
break;
case '%':result=num1%num2;
System.out.println(result);
break;
default:
System.out.println("invalid operator");
return;
}
System.out.println("result="+result);
}
}

