class A
{
public int x=10;
}
class B extends A
{
int y=30;
public static void main(String [] args)
{
B ob=new B();
System.out.println(ob.x+ob.y);
}
}