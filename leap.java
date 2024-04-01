package java_basic2;

import java.util.Scanner;

public class leap {

	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   int year;
	   System.out.println("Enter Year");
	   year=s.nextInt();
	   if(year%4==0)
		   System.out.println("The year  "+year+ " is leap year");
	   else
		   System.out.println("The year "+year +" is not leap year");
	 
	   
	}
	
}