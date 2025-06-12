// Aswin menon cs2 rollno-14//
import java.util.Random;

class NumberGenerator implements Runnable
{
	private Random random=new Random();
	public void run()
	{
		while(true)
    		{
       		int number=random.nextInt(100);
    
 			System.out.println("Generated:" +number);
        		if(number%2==0)
    			{
       			ThreadSquare squareThread=new ThreadSquare(number);
       			new Thread(squareThread).start();
    			}
			else
    			{
       			ThreadCube cubeThread=new ThreadCube(number);
      				 new Thread(cubeThread).start();
   			 }
			try
       		{
         			Thread.sleep(1000);
      			 }
			catch(InterruptedException e)
       		{
         			e.printStackTrace();
      			 }
    		}
  	}
}
class ThreadSquare implements Runnable
{
	private int number;
	public ThreadSquare(int number)
	{
		this.number=number;
	}
	public void run()
	{
		System.out.println("Square:"+(number*number));
	}
}
class ThreadCube implements Runnable
{
	private int number;
	public ThreadCube(int number)
	{
		this.number=number;
	}
	public void run()
	{
		System.out.println("Cube:"+(number*number*number));
   	}
}
public class Multithread
{
	public static void main(String[] args)
	{
		NumberGenerator numberGenerator=new NumberGenerator();
		new Thread(numberGenerator).start();
	}
   }
/*output
Generated:85
Cube:614125
Generated:33
Cube:35937
Generated:42
Square:1764 */
