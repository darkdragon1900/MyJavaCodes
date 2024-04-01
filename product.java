package java_basic2;

import java.util.Scanner;

public class product {

	public static void main(String[] args) 
	{
		Scanner o = new Scanner(System.in);
		String name;
		int qua;
		double rate,amt,dis,n_amt;
		System.out.println("Enter name of Product :");
	    name=o.next();
		System.out.println("Enter rate of product :");
		rate=o.nextDouble();
		System.out.println("Enter Quantity of Product");
		qua=o.nextInt();
		amt=rate*qua;
		if(amt>5000)
			dis=amt*0.10;
		else
			dis=amt*0.7;
		
		
		
		System.out.println("Congrats!!! you have got RS "+dis+"  dicount.");
		
		n_amt=amt-dis;
		System.out.println("Your Final Amount to pay is RS "+n_amt);
 
	}

}
