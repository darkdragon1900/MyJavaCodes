package java_basic2;
import java.util.Scanner;
public class do1 {

	
	public static void main(String[] args) {
		
		Scanner cc = new Scanner(System.in);
		
		int num;
		int fact=1;
		System.out.println("Enter a num");
		num=cc.nextInt();
		do
		{
			
			
			fact=fact*num;
			num--;
			
		}
		while(num>0);
		
		System.out.println("Factorial = "+fact);
		
	}

}
