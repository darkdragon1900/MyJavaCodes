package oop2;

public class ParaCons {
	
	private 
	int a;
	float b;
	String c;
	double d;
	boolean e;
	
	public 
	
	ParaCons()
	{
		System.out.println("First Default const");
		a=1000;
		b=10.50f;
		
	}
	
	ParaCons(int a,float b)
	{
		System.out.println("\nSecond parameterized const");
		this.a=a;
		this.b=b;
	}
	
	ParaCons(int a,float b,String c,double d)
	{
		System.out.println("\nThird parameterized const");
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
	
	ParaCons(int a,float b,String c,double d,boolean e)
	{
		System.out.println("\nFourth parameterized const");
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
	}
	
	void show()
	{
		System.out.println("\na="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
	}

}
