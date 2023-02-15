interface I1
{
void f1();
}
class Inter implements I1
{
public void f1()
{
System.out.println("hello");
}
public static void main(String [] args)
{
Inter i=new Inter();
i.f1();
}
}