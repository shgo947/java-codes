//reference variable
class Ref
{
int x=10;
public static void main(String [] args)
{
Ref r1; //Reference creation
Ref r=new Ref();
r1=r;
System.out.println(r1.x);
r1=null;
System.out.println(r1.x);
}
}