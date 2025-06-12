/* Aswin menon cs2 14*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file{
public static void main(String[] args){
  String inputFile="input.txt";
  String outputFile="output.txt";
  
  try{
  BufferedReader reader=new BufferedReader(new FileReader(inputFile));  
   BufferedWriter writer=new BufferedWriter(new FileWriter(outputFile)); 
   String line;
   while((line=reader.readLine())!=null){
   writer.write(line);
   writer.newLine();
   }
   reader.close();
   writer.close();
   System.out.println("File Handling complete");
   }
   catch(IOException e){
   e.printStackTrace();
   }
   }
   }
   /* output
   File Handling complete
*/
    
