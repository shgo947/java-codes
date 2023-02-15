import java.util.*;
class pat
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
for(int i=0;i<x;i++)
{
for(int j=x-1;j>=i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=(2*i+1);k++)
{
System.out.print("*");
}
System.out.println("");
}
for(int i=0;i<x-1;i++)
{
for(int j=0;j<=i+1;j++)
{
System.out.print(" ");
}
for(int k=(2*(x-2)+1);k>2*i;k--)
{
System.out.print("*");
}
System.out.println("");
}
}
}