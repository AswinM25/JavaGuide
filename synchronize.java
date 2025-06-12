/* ASWIN MENON CS2 14*/
class table
{
	synchronized void table(int n)
	{
	for(int i=1;i<11;i++)
	{
	System.out.println(n+"*"+i+"="+n*i);
	}
   }
}
class A extends Thread
{
 table p=new table();
 A(table p)
 {
 this.p=p;
 }
 public void run()
 {
 p.table(5);
 }
 }
 class B extends Thread
{
 table p=new table();
 B(table p)
 {
 this.p=p;
 }
 public void run()
 {
 p.table(6);
 }
 }
 class synchronize
 {
 public static void main(String[] args){
table p=new table();
A t1=new A(p);
t1.start();
B t2=new B(p);
t2.start();
}
}
/*Output
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
6*1=6
6*2=12
6*3=18
6*4=24
6*5=30
6*6=36
6*7=42
6*8=48
6*9=54
6*10=60
*/
