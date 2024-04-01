package oop2;
import java.util.Scanner;
public class MainMethod {

	public static void main(String[] args) {
		//MethodOver ss = new MethodOver();
		
		//System.out.println("add="+ss.same(10, 15));
		//System.out.println("Square ="+ ss.same(18));
		//System.out.println("Float add=" + ss.same(10.50, 15.500));
		MyTest ss = new MyTest();
		int a;
		int b;
		double x,y,z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 Integers ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("\nAddition of Integers "+ a + "+" + b + "="+ ss.sum(a, b));
		
		
		System.out.println("\nEnter 3 Double values ");
		
		x=sc.nextDouble();
		y=sc.nextDouble();
		z=sc.nextDouble();
		
		
		System.out.println("\nAddition of double = " + ss.sum(x,y,z));
	}

}
