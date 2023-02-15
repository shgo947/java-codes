class base
{
void show()
{
System.out.println("show base");
}
}
class der extends base
{
void show()
{
System.out.println("show derived");
}
public static void main(String [] args)
{
base ob1;
base ob;
ob=new base();
ob1=new der();
ob1.show();
ob.show();
}
}