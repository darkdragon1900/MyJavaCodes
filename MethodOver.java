package oop2;

public class MethodOver {
	private 
	int a,b;
	float c;
	double d,e;
	
	public 
	
	int same(int a, int b)
	{
		this.a=a;
		this.b=b;
		
		return(a+b);
		
	}
	
	float same(int c)
	{
		this.c=c;
		c=c*c;
		return(c);
		
	}
	
	double same(double d,double e)
	{
		this.d=d;
		this.e=e;
		d=d+e;
		return(d);
		
	}

}
