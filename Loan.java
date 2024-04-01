import java.util.Scanner;

class Loan
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
float p,r,t;
float emi;
float e_amt,l_amt;
System.out.println("Enter loan amount , rate and no of years");
System.out.println("Enter loan amount,  rate and no of years");
p=sc.nextFloat();
System.out.println("Loan Amount = "+p);
r=sc.nextFloat();
System.out.println("Rate of Interest = "+r);
t=sc.nextFloat();
System.out.println("No of Years = "+t);
l_amt=p*r*t/100;
System.out.println("Pay loan amount ="+l_amt);
emi=t*12;
System.out.println("No of EMI's ="+emi);
e_amt=l_amt/emi;
System.out.println("Emi_amount ="+e_amt);
}
}