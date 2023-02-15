//abstract class
abstract class Inh
{
abstract void f1();
}
class Abs extends Inh
{
void f1()
{
System.out.println("hello");
}
public static void main(String [] args)
{
Abs ob=new Abs();
ob.f1();
}
}
