/* Aswin menon cs2 14*/
import java.util.*;
abstract class Shape{
abstract void numberOfsides();
}

class Rectangle extends Shape{
void numberOfsides(){
System.out.println("A Rectangle has 4 sides");
}
}

class Triangle extends Shape{
void numberOfsides(){
System.out.println("A Triangle has 3 sides");
}
}
class Hexagon extends Shape{
void numberOfsides(){
System.out.println("A Hexagon has 6 sides");
}
}
public class main2{
public static void main(String[]args){
Shape rectangle=new Rectangle();
Shape triangle=new Triangle();
Shape hexagon=new Hexagon();

System.out.println("Details of shape");
rectangle.numberOfsides();
triangle.numberOfsides();
hexagon.numberOfsides();
}
}
/*Output
Details of shape
A Rectangle has 4 sides
A Triangle has 3 sides
A Hexagon has 6 sides
*/
