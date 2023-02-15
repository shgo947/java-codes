//wap in java to implement interface.create 3 interface i1,i2,i3.i3 inherit i2 and i2 inherited i1.create a class with a name PQR.this class inherited to i3.
interface i1
{
void f1();
}
interface i2 extends i1
{
void f2();
}
interface i3 extends i2
{
void f3();
}
class PQR implements i3
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
PQR m=new PQR();
m.f1();
m.f2();
m.f3();
}
}