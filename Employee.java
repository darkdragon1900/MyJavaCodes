package oop2;
import java.util.Scanner;
public class Employee {

	private 
	String name;
	int sal;
	int id,total=0;
	int a[];
	
	
	public 
	
	Employee(String name,int id,int sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	void set()
	{
		Scanner ss = new Scanner(System.in);
		a = new int[6];
		System.out.println("Enter Present days for 6 months ");
		for(int i=0;i<6;i++)
		{
			a[i]=ss.nextInt();
			
			if(a[i]>0 && a[i]<32)
				total=total+a[i];
			else
				System.out.println("Invalid days Entered");
			
			
			
		}
		
		
		if(total>=150)
		{
			System.out.println("Salary Increament Rs.2500");
			sal=sal+2500;
		}
		else
			{
			System.out.println("Salary Increament Rs.2500");
			sal=sal+1000;
			}
		
	}
	
	void get()
	{
		System.out.println("Name of Employee = " + name);
		System.out.println("Employee id = " + id);
	}
	
	void show()
	{
		
		System.out.println("Employee today present days = "+ total);
		System.out.println("Employee salary = "+ sal);
	}
}
