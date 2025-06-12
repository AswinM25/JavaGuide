/*ASWIN MENON CS2 14*/
import java.util.Scanner;

class Node
{
	int data;
	Node llink;
	Node rlink;
	public Node(int data)
	{
	
		this.data=data;
		this.llink=null;
		this.rlink=null;
	}
}

class DoublyLinkedList
{

	Node head;
	
	public void insertbegin(int data)
	{
	Node newNode=new Node(data);
	if(head==null)
	{
	head=newNode;
	}
	else
	{
	newNode.rlink=head;
        head.llink=newNode;
	head=newNode;
	
	}
}
public void insertend(int data)
	{
	Node newNode=new Node(data);
	if(head==null)
	{
	head=newNode;
	}
	else
	{
	Node ptr=head;
	while(ptr.rlink!=null)
	{
	ptr=ptr.rlink;
	}
	ptr.rlink=newNode;
	newNode.llink=ptr;
	
	}
   
}
public void insertmiddle(int data,int key)
	{
	Node newNode=new Node(data);
	if(head==null)
	{
	head=newNode;
	}
	else
	{
	Node ptr=head;
	while(ptr.data!=key)
	{
	ptr=ptr.rlink;
	}
	if(ptr!=null)
	{
	newNode.rlink=ptr.rlink;
	newNode.llink=ptr;
	ptr.rlink=newNode;
	
	}
	else 
	{
	System.out.println("not found");
	}
    
  }   
}

 public void delete(int key)
 {
 	if(head==null)
 	{
 	System.out.println("Underflow");
 	return;
 	}
 	Node ptr=head;
 	Node prev=null;
 	while(ptr.data!=key)
 	{
 	prev=ptr;
 	ptr=ptr.rlink;
 	}
 	if(ptr==null)
 	{
 	System.out.println("Not found");
 	}
 	else
 	{
 	if(prev==null)
 	{ head=ptr.rlink;
 	if(ptr.rlink!=null)
 	{
 	ptr.rlink=null;
 	ptr.llink=null;
 	}
 }
 else
 {
 prev.rlink=ptr.llink;
 if(ptr.rlink!=null)
 {
 ptr.rlink=null;
 ptr.llink=null;
 		}
 	    }
      }
 }
      public void display()
      {
      Node ptr=head;
      
      while(ptr!=null)
      {
      System.out.println(ptr.data);
      ptr=ptr.rlink;
      }
      System.out.println("\n");
      }
    }
public class DLL{
      public static void main(String[] args)
      {
      Scanner sc=new Scanner(System.in);
      DoublyLinkedList list=new DoublyLinkedList();
      int n=0;
      int a=0;
      int key=0;
      int choice;
      while(true)
      {
      System.out.println("/n Menu:/n");
      System.out.println(" 1. Insert at Beginning:");
      System.out.println(" 2. Insert at Middle:");
      System.out.println(" 3. Insert at End:");
      System.out.println(" 4.Delete Element:");
      System.out.println(" 5.Display List:");
      System.out.println(" 6.Exit:");
      System.out.println(" Enter your choice:");	
      n=sc.nextInt();
     switch(n)
     {
     case 1:
     System.out.println("Insert elements");	
     a=sc.nextInt();
     list.insertbegin(a);
     break;
     case 2:
     System.out.println("Insert elements");
     a=sc.nextInt();
     System.out.println("Insert key");
     key=sc.nextInt();
     list.insertmiddle(a,key);
     break;
     case 3:
     System.out.println("Insert elements");	
     a=sc.nextInt();
     list.insertend(a);
     break;
     case 4:
     System.out.println("Insert key");
     key=sc.nextInt();
     list.delete(key);
     break;
     case 5:
     list.display();
     break;
     case 6:
     System.out.println("Exiting the program!");
     return;
     	}
      }
    }
  }
/*OUTPUT
/n Menu:/n
 1. Insert at Beginning:
 2. Insert at Middle:
 3. Insert at End:
 4.Delete Element:
 5.Display List:
 6.Exit:
 Enter your choice:
1
Insert elements
1
/n Menu:/n
 1. Insert at Beginning:
 2. Insert at Middle:
 3. Insert at End:
 4.Delete Element:
 5.Display List:
 6.Exit:
 Enter your choice:
1
Insert elements
2
/n Menu:/n
 1. Insert at Beginning:
 2. Insert at Middle:
 3. Insert at End:
 4.Delete Element:
 5.Display List:
 6.Exit:
 Enter your choice:
3
Insert elements
3
/n Menu:/n
 1. Insert at Beginning:
 2. Insert at Middle:
 3. Insert at End:
 4.Delete Element:
 5.Display List:
 6.Exit:
 Enter your choice:
2
Insert elements
4
Insert key
3
/n Menu:/n
 1. Insert at Beginning:
 2. Insert at Middle:
 3. Insert at End:
 4.Delete Element:
 5.Display List:
 6.Exit:
 Enter your choice:
5
2
1
3
4


/n Menu:/n
 1. Insert at Beginning:
 2. Insert at Middle:
 3. Insert at End:
 4.Delete Element:
 5.Display List:
 6.Exit:
 Enter your choice:
6
Exiting the program!
*/
     
