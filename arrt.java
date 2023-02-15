import java.util.Scanner;
class arrt
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int x[][]=new int[5][5];
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
x[i][j]=sc.nextInt();
}
}
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("\t"+x[i][j]);
}
System.out.println("");
}

}
}