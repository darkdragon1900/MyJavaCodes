package java_basic2;

import java.util.Scanner;

public class Convert {

	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   int a,b;
	   System.out.println("Enter Rupess");
	   a=s.nextInt();
	   b=a*100;
	   System.out.println(a+" Rupees = "+ b+" paise");
	}
	
}
