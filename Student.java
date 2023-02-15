import java.util.Scanner;
class Student
{
 String name=new String();
 int age;
 float cgpa;
 Scanner sc=new Scanner(System.in);
 void getData()
{
System.out.println("Enter name:");
name=sc.next();
System.out.println("Enter age:");
age=sc.nextInt();
System.out.println("Enter cgpa:");
cgpa=sc.nextFloat();
}
 void showData()
{
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("cgpa:"+cgpa);
}
public static void main(String [] args)
{
int t;
System.out.println("Enter no of students:");
Scanner sc1=new Scanner(System.in);
t=sc1.nextInt();
Student s[]=new Student[100];
for(int i=0;i<t;i++)
{
s[i]=new Student();
}
for(int i=0;i<t;i++)
{
s[i].getData();
}
for(int i=0;i<t;i++)
{
s[i].showData();
}
}
}