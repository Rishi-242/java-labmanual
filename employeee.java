import java.util.*;
class Employee 
{
    public static void main(String[] args) 
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no.of employees");
       int n=sc.nextInt();
       int id[]=new int[n];
       String name[]=new String[n+1];
       int age[]=new int[n];
       String gender[]=new String[n+1];
       //String des[]=new String[n];
       float salary[]=new float[n];
       String address[]=new String[n+1];
       //System.out.println("enter all employee details");
       for(int i=0;i<n;i++)
       {
          System.out.println("enter details of employee "+i);
          System.out.println("employee id");
          id[i] = sc.nextInt();
          System.out.println("employee name");
          name[i] = sc.nextLine();
          name[i] = sc.nextLine();
          System.out.println("employee age");
          age[i] = sc.nextInt();
          System.out.println("employee gender");
          gender[i] = sc.next();
          System.out.println("employee salary");
          salary[i] = sc.nextFloat();
          System.out.println("employee address");
          address[i] = sc.next();
       }
       System.out.println("enter id to get details");
       int idget=sc.nextInt();
       for(int i=0;i<n;i++)
       {
          if(idget==id[i])
          {
             System.out.println(id[i]+" "+name[i]+" "+age[i]+" "+gender[i]+" "+salary[i]+" "+address[i]);
          }
       }
   }
}
