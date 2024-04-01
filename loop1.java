package java_basic2;
import java.util.Scanner;

public class loop1 {
	
	public static void main(String args[])
	{
		
		Scanner cc = new Scanner(System.in);
		
		
		int total=0;
		int n=1;
		while(n<=5)
		{
			
			int num;
			System.out.println("Enter a num");
			num=cc.nextInt();
			total=num+total;
			n++;
			
		}
		
		System.out.println("Total = "+total);
		
		System.out.println("Average = "+(total/5));
		
	}
	

}
