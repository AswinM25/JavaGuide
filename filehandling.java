/*ASWIN MENON cs2 14 */
import java.io.*;
import java.util.*;

class filehandling
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			File obj=new File("output.txt");
			try
			{
				FileWriter w= new FileWriter("output.txt");
				w.write("This will be displayed in the Output file");
				
				System.out.println("File Successfully written. File closed.");
			}
			catch(IOException e1)
			{ 
				System.out.println("Error Occured");
				e1.printStackTrace();
			}
			try 
			{
				Scanner r1=new Scanner(obj);
				while(r1.hasNextLine())
				{
					String output = r1.nextLine();
					System.out.println(output);
				}
				char[] output = new char[50];
				FileReader r = new FileReader("input.txt");
				System.out.println("\nText in input file is :");
				r.read(output);
				System.out.print(output);
				FileWriter w= new FileWriter("output.txt");
				w.write(output);
				w.close();
				r.close();
				System.out.println("\nFile successfull.");
			}
			catch(FileNotFoundException e2)
			{
				System.out.println("Error : File is not found");
				e2.printStackTrace();
			}
		}
		catch(IOException e)
		{
			System.out.println("Error");
			e.printStackTrace();
		}
		finally
		{
		System.out.println("This will always print ! ");
		}
	}
}
/* OUTPUT

File Successfully written. File closed.

Text in input file is:
hello


File read and wrote successfully.
This will always print ! 
*/

