/* Aswin menon CS2 14*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileexception{
public static void main(String[] args){
String inputFile="input.txt";
String outputFile="output.txt";
 try{
 FileReader reader=new FileReader(inputFile);
 FileWriter writer=new FileWriter(outputFile);
 
 int character;
 while((character=reader.read())!=-1)
 {
 writer.write(character);
 }
 System.out.println("File read and write completed");
 }
 catch(IOException e){
e.printStackTrace();
}
}
}
/* Output
File read and write completed
*/
