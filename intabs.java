interface i
{
void f1();
}
abstract class c1 implements i
{
abstract void f2();
public void f1()
{
System.out.println("HI");
}
}
class intabs extends c1
{
void f2()
{
System.out.println("Shivansh Goyal");
}
public static void main(String [] args)
{
intabs ob=new intabs();
ob.f1();
ob.f2();
}
}