import java.util.*;
class num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Set<Integer>uniquenumber=new HashSet<>();
System.out.println("enter the  5 numbers between 10 to  100");
for(int i=0;i<5;)
{
int j=sc.nextInt();
if(j>=10 && j<=100)
{
if(uniquenumber.add(j))
{
System.out.println("unique set of number"+uniquenumber);
i++;
}
else
{
System.out.println("duplicate numbers");
}
}
else
{
System.out.println("number must be between 10 and 100");
}
}
System.out.println("final set of unique numbers"+uniquenumber);
}
}

