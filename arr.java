import java.util.Scanner;
class arr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int x[]=new int[10];
for(int i=0;i<10;i++)
{
x[i]=sc.nextInt();
}
for(int i=0;i<10;i++)
{
System.out.print(" "+x[i]);
}
}
}