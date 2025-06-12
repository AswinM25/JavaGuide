/* Aswin menon cs2 14*/
import java.util.*;
public class frequency
{
public static void main(String args[])
{
int i,count=0;
String text,key;
Scanner sc=new Scanner(System.in);
System.out.println("Enter string:");
text = sc.nextLine();
System.out.println("Enter the character:");
key = sc.nextLine();
 char[] ch=text.toCharArray();
 char[] letter=key.toCharArray();
 int len=ch.length;
 for(i=0;i<len;i++)
 {
 if(ch[i]==letter[0])
 {
 count++;
 }
 }
 System.out.println("occurance of character:"+count);
 }
 }
 /* output
 Enter string:
hello
Enter the character:
l
occurance of character:2
*/
