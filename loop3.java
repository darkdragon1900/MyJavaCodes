package java_basic2;
import java.util.Scanner;
public class loop3 {
	public static void main(String[] args)
	{
		Scanner cc = new Scanner(System.in);
		int n=1990;
		int count=0;
		while(n<=2020)
		{
			
			if(n%4==0 )
				{System.out.println("leap year = "+n);
			     count++;
				}
			n++;
		}
		System.out.println("Total leap Years = "+count);
	}

}
