import java.util.Scanner;

class Marksheet
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
String name;
int r_no,m1,m2,m3 ;
int total;
float per;

System.out.println("Enter Name of Student");
name=sc.next();
System.out.println("Enter sub1 marks");
m1=sc.nextInt();
System.out.println("Enter sub2 marks");
m2=sc.nextInt();
System.out.println("Enter sub3 marks");
m3=sc.nextInt();

total=m1+m2+m3;
per=(total*100)/300;

System.out.println("Name of Student ="+name);
System.out.println("Java ="+m1);
System.out.println("C++ ="+m2);
System.out.println("C ="+m3);
System.out.println("Total Marks ="+total);
System.out.println("Percentage ="+per+"%");
}

}