import java.util.*;
class command{
public static void main(String args[])
{
if(args.length==0)
{
System.out.println("no command line arguments");
}
else
{
System.out.println("command line arguments");
}
for(int i=0;i<args.length;i++)
{
System.out.println("arguments"+(i+1)+":"+args[i]);
}
}
}
