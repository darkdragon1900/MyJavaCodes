import java.util.Scanner;

class Number
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float p,r,t,amt,si;
System.out.println("Enter principle , rate and years");
p=sc.nextFloat();
System.out.println("Principle = "+p);
r=sc.nextFloat();
System.out.println("Rate of Interest = "+r);
t=sc.nextFloat();
System.out.println("No of Years = "+t);
si=p*r*t/100;
System.out.println("Simple Interest ="+si);
amt=p+si;
System.out.println("Total Amount ="+amt);
}


}