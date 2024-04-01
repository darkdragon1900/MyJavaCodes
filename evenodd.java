package java_basic2;

import java.util.Scanner;

public class evenodd {

	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   int a;
	   System.out.println("Enter Number");
	   a=s.nextInt();
	   if(a%2==0)
		   System.out.println("Your number "+a+ " is even");
	   else
		   System.out.println("Your number "+a +" is odd");
	 
	   
	}
	
}
