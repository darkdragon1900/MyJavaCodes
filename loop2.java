package java_basic2;
import java.util.Scanner;
public class loop2 {

	public static void main(String[] args) {
		
		Scanner cc = new Scanner(System.in);
		int n=1;
		int count=0;
		
		while(n<=5)
		{
			int num;
			System.out.println("Enter a num");
			num=cc.nextInt();
			n++;
			if(num%2==0)
				count++;
		
		}
		System.out.println("Even number = "+count);
		
	}

}
