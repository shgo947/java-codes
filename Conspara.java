//Constructor
import java.util.Scanner;
class Conspara
{
Conspara()
{
int x=10;
System.out.println(x);
}
Conspara(int x,int y)
{
System.out.println(x+y);
}
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
int q=sc.nextInt();
Conspara c1=new Conspara();
Conspara c=new Conspara(p,q);
}
}