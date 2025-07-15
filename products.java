import java.util.*;
class products
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int retailprice=0;
while(true)
{
System.out.println("product 1 rs 99.90");
System.out.println("product 2 rs 20.20");
System.out.println("product 3 rs 6.87");
System.out.println("product 4 rs 45.50");
System.out.println("product 5 rs 40.49");
System.out.println("enter product number");
int productnumber=sc.nextInt();
if(productnumber==6)
{
break;
}
System.out.println("enter quality sold");
int qualitysold=sc.nextInt();
switch(productnumber)
{
case 1:retailprice+=(99.90*qualitysold);
break;
case 2:retailprice+=(20.20*qualitysold);
break;
case 3:retailprice+=(6.87*qualitysold);
break;
case 4:retailprice+=(45.50*qualitysold);
break;
case 5:retailprice+=(40.49*qualitysold);
break;
default:System.out.println("invalid");
}
System.out.println("the total retailprice products:"+retailprice);
}}}

