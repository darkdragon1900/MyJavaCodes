package oop2;

public class Product {
	
	private 
	String name;
	int rate,amt,qua;
	
	public 
	
	Product(String n,int r)
	{
		this.name=n;
		this.rate=r;
		
	}
	
	void set(int q)
	{
		qua=q;
		amt=rate*qua;
	}
	
	void show()
	{
		System.out.println("\n\nName of Product : " + name);
		System.out.println("Rate of Product : " + rate);
		System.out.println("Quantity of Product : " + qua);
		System.out.println("Total Amount : " + amt);
	}
	

}
