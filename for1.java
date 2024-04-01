package java_basic2;
import java.util.Scanner;
public class for1 {

	
	public static void main(String[] args) {
		
		Scanner cc = new Scanner(System.in);
	    int i;
	    int a[];
	    a = new int[5];
	    int total=0;
	    int maximum=0,p=0;
	    System.out.println("Enter 4 Array Elements");
	    
	    for(i=1;i<=4;i++)
		{
	    	
	    	a[i]=cc.nextInt();
	    		
		}
	    
	    for(i=1;i<=4;i++)
		{
	    	System.out.println("a["+i+"]="+a[i]);
	    	total=total+a[i];
	    	if(a[i]>maximum)
	    	{
	    		maximum=a[i];
	    		p=i;
	    	}	    	
		}	
	    
	    System.out.println("Total sum of elements = "+total);
	    System.out.println("Average of elements = "+total/5);
	    System.out.println("Greatest Element = " + maximum);
	    System.out.println("Greatest Element stored at " + p + " position");
}
}