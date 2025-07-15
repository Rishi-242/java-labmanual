import java.util.*;
import java.util.Random;
class Dice{
 public static void main(String[] ar)
 {
   int n=0,dice1,dice2,i;
   int m=0;
   Scanner sc=new Scanner(System.in);
   Random r= new Random();
   dice1=r.nextInt(6);
   dice2=r.nextInt(6);
   for(i=0;i<10;i++)
   {
    System.out.println("enter the two numbers");
    dice1=sc.nextInt();
    dice2=sc.nextInt();
    
    if((dice1>=1&&dice1<=6)&&(dice2>=1&&dice2<=6)) 
    {
    if(dice1==dice2)
    {
     n++;
     }
   else
   {
    m++;
    }
  }
else
{
 System.out.println("invalid numbers for dice");
 }
}
System.out.println("Successfull attempts="+m);
System.out.println("unsuccessfull attempts="+n);
}
}
