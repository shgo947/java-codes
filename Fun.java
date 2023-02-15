//Function
import java.util.Scanner;
class Fun
{
static void f1()
{
System.out.println("Hello");
}
static int f1(int x,int y)
{
return (x+y);
}
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int q=sc.nextInt();
Fun ob=new Fun();
Fun.f1();
System.out.println(Fun.f1(p,q));
}
}