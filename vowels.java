import java.util.*;
class vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String s1=sc.nextLine().toLowerCase();
int vowel=0;
int consonant=0;
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
{
vowel++;
}
else if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
{
consonant++;
}
}
System.out.println("the vowels count ="+vowel);
System.out.println("the consonants count="+consonant);
}
}

