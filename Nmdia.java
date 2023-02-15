import java.util.Scanner;
class Nmdia
{
public static void main(String [] args)
{
String s=new String();
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
int l=s.length();
int temp=l;
for(int i=0;i<l;i++)
{
for(int j=0;j<temp;j++)
{
System.out.print(" ");
}
temp-=1;
System.out.print(s.charAt(i));
for(int k=0;k<2*i;k++)
{
if(k==i || k==i-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.print(s.charAt(i));
System.out.println("");
}
int tem=0;
for(int i=l-1;i>=0;i--)
{
for(int j=0;j<tem+1;j++)
{
System.out.print(" ");
}
tem++;
System.out.print(s.charAt(i));
for(int k=1;k<=2*i;k++)
{
if(k==i || k==i+1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.print(s.charAt(i));
System.out.println("");
}
}
}