package OOP;
import java.util.Scanner;
public class MyMain {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		int x,m;
		int y,n;
		System.out.println("For 1st Object");
		
	    System.out.println("Enter First Number");
		x=ss.nextInt();
		System.out.println("Enter Second Number");
		y=ss.nextInt();
		
		System.out.println("\n\nFor 2nd Object");
		
	    System.out.println("Enter First Number");
		m=ss.nextInt();
		System.out.println("Enter Second Number");
		n=ss.nextInt();
		
		MaxAdd m1 =new MaxAdd();
		MaxAdd m2 =new MaxAdd();

		m1.set(x, y);
		m2.set(m, n);
		
		if(m1.ret()>m2.ret())
			{System.out.println("\nFirst Object has Greater Sum");
		    m1.get();
			}
		else
		{
		System.out.println("\nSecond Object has Greater sum");
		m2.get();
		}
	}   

}
