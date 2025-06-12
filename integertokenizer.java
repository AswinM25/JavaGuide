/*Aswin menon cs2 14*/
import java.util.*;
public class integertokenizer
{
 public static void main(String[] args)
 {
   int sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a line of integers seperated by space:");
   String s=sc.nextLine();
   StringTokenizer token=new StringTokenizer(s,",");
   System.out.println(token.countTokens());
   while(token.hasMoreTokens())
   {
     sum=sum+Integer.parseInt(token.nextToken());
   }
   System.out.println("sum of all integers:"+sum);

}
}
/* Output
Enter a line of integers seperated by space:
1,2,3,4,5
5
sum of all integers:15
*/
