package java_basic2;
import java.util.Scanner;
public class menu2 
{

	public static void main(String[] args) 
{
	
	Scanner ss=new Scanner(System.in);
	int num1;
	int num2,ch;
	
	
	do {
	System.out.println("What to do :" 
			+ "\n1.Addition "
			+ "\n2.Multiplication"
			+ "\n3.Subtraction"
			+ "\n4.Division");
	System.out.println("Enter your choice");
	ch=ss.nextInt();
	System.out.println("Enter two numbers");
	num1=ss.nextInt();
	num2=ss.nextInt();	
	switch(ch)
	{
	case 1: 
		System.out.println("Addition = "+( num1+num2));
		break;
	case 2:
		System.out.println("Multiplication = "+ (num1*num2));
		break;
	case 3 :
		System.out.println("Subtraction = "+ (num1-num2));
		break;
	case 4 :
		System.out.println("Divison = "+ (num1/num2));
		break;
	case 0 :
		
	default :
		System.out.println("Wrong choice!!!!");
	}
	
	

}
	while(ch!=0);

}
}
