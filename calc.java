import java.util.Scanner;
class calc
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
char chc='y';
do{
System.out.println("enter 2 variables:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("1.add \n2.subtract \n3.multiply \n4.divide \n5.mod");
System.out.println("enter choice:");
int ch=sc.nextInt();
if(ch==1)
{
System.out.println("Sum="+(a+b));
}
else if(ch==2)
{
System.out.println("dif="+(a-b));
}
else if(ch==3)
{
System.out.println("pro="+(a*b));
}
else if(ch==4)
{
System.out.println("qou="+(a/b));
}
else if(ch==5)
{
System.out.println("rem="+(a%b));
}
else
{
System.out.println("wrong!!!");
}
System.out.println("continue:Y");
chc=sc.next().charAt(0);
}while(chc=='Y');
}
}