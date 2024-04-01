package oop2;
import java.util.Scanner;
public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ss= new Scanner(System.in);
		
		String n,n1;
		int r,r1;
		
		System.out.println("Enter 1st Product name and rate");
		
		n=ss.next();
		r=ss.nextInt();
		
		System.out.println("Enter 1st Product name and rate");
		
		n1=ss.next();
		r1=ss.nextInt();
		
		
		Product p1 = new Product(n,r);
		p1.set(5);
		p1.show();
		
		Product p2 =new Product(n1,r1);
		p2.set(7);
		p2.show();
		
	}

}
