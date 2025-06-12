/* Aswin menon cs2 14*/
import java.io.*;
import java.util.*;

public class file{
public static void main(String[] args){
  try{
  File obj=new File("output.txt");
  
  if(obj.createNewFile()){
  System.out.println("File created successfully" +obj.getName());
  }
  else{
  System.out.println("File already exists" +obj.getName());
  System.out.println(obj.getAbsolutePath());
  }
  try{
  FileWriter W=new FileWriter("output.txt");
  W.write("This is to test that I can write in a file");
  W.close();
  System.out.println("File successfully written");
  }
  catch(IOException e){
   System.out.println("Error Occured");
   e.printStackTrace();
   }
   try{
   Scanner r1=new Scanner(obj);
   while(r1.hasNextLine()){
   String output=r1.nextLine();
   System.out.println(output);
   }
   char[] output=new char[50];
   FileReader r= new FileReader("input.txt");
   r.read(output);
   r.close();
   System.out.println("File is successfully.File closed");
   }
   catch(FileNotFoundException e2){
   System.out.println("Error occured");
   e2.printStackTrace();
   }
   }
   catch(IOException e){
   System.out.println("Error occured");
   e.printStackTrace();
   }
   }
   }
  /* Output 
File already existsoutput.txt
/home/s3cs2_14/s3cs2/output.txt
File successfully written
This is to test that I can write in a file
File is successfully.File closed
*/

    
