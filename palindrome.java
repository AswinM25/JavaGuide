/* Aswin menon cs2 14*/
import java.util.*;
public class palindrome
{
public static void main(String args[])
{
int flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
char[] ch=str.toCharArray();
int j=ch.length;
for(int i=0;i<j;i++)
{
if(ch[i]!=ch[j-i-1])
{
flag++;
}
}
if(flag<1)
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}
/* output
Enter the string
malayalam
palindrome
*/
