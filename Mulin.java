interface i1
{
void f1();
}
interface i2
{
void f2();
void f3();
}
class Mulin implements i1,i2
{
public void f1()
{
System.out.println("Hello");
}
public void f2()
{
System.out.println("Hi");
}
public void f3()
{
System.out.println("Bonjour");
}
public static void main(String [] args)
{
Mulin m=new Mulin();
m.f1();
m.f2();
m.f3();
}
}