package OOP;

public class MaxAdd {
	
	private 
	int a,b,c;
	
	public 
	
	void set(int a,int b)
	{
	   this.a=a;
	   this.b=b;
	   c=a+b;
	}
	
	void get()
	{
		System.out.println("First Number = "+a);
		System.out.println("Second Number= "+b);
		System.out.println("Sum= "+c);
	}
	
	int ret()
	{
		return(c);
	}
	

}
