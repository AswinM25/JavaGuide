/* Aswin menon cs2 14*/
class gcl
{
String name;
gcl(String name)
{
this.name=name;
}
protected void finalize()
{
System.out.println("garbage collected");
}
public static void main(String[] args)
{
gcl asw=new gcl("Asw");
gcl win=new gcl("Win");

asw=null;
win=null;
System.gc();
}
}
/* Output
garbage collected
*/
