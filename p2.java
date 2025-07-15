import java.util.Scanner;
class Pro2{
public static void main(String[] args) {
int[] arr = new int[10];
Scanner sc = new Scanner(System.in);
int i,j,temp,key,flag=0;
System.out.print("Enter size of array:");
int n= sc.nextInt();
System.out.printf("Enter %d elements:",n);
for(i=0;i<n;i++)
arr[i] = sc.nextInt();
System.out.print("What to search:");
key= sc.nextInt();
for(i=0;i<n;i++)
{
if(key == arr[i])
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.print("FOUND");
}
else
{
System.out.print("NO");
}
}
}
