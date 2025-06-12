/* Aswin menon cs2 14*/
import java.util.*;
class Employee
{
String name;
int age;
String phone_no;
String address;
double salary;

void printSalary(){
System.out.print("Salary" +salary);
}
}

class Officer extends Employee{
String Specialization;
}

class Manager extends Employee{
String Department;
}

public class main{
public static void main(String[] args){
Officer officer=new Officer();
officer.name="Abraham";
officer.age=55;
officer.phone_no="123-456-7890";
officer.address="98 Alm St";
officer.salary=80000.0;
officer.Specialization="Finance";

Manager manager=new Manager();
manager.name="Rick";
manager.age=48;
manager.phone_no="226-345-7896";
manager.address="45 Alm St";
manager.salary=10000.0;
manager.Department="HR";

System.out.println("Officer");
System.out.println("Name: " +officer.name);
System.out.println("age: " +officer.age);
System.out.println("phone_no: " +officer.phone_no);
System.out.println("address: " +officer.address);
officer.printSalary();
System.out.println("Specialization: " +officer.Specialization);

System.out.println("Manager");
System.out.println("Name: " +manager.name);
System.out.println("age: " +manager.age);
System.out.println("phone_no: " +manager.phone_no);
System.out.println("address: " +manager.address);
manager.printSalary();
System.out.println("Specialization: " +manager.Department);
}
}
/* Output
Officer
Name: Abraham
age: 55
phone_no: 123-456-7890
address: 98 Alm St
Salary80000.0Specialization: Finance
Manager
Name: Rick
age: 48
phone_no: 226-345-7896
address: 45 Alm St
Salary10000.0Specialization: HR
*/
