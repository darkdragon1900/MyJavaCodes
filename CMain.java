package oop2;

public class CMain {
	
	public static void main(String[] args)
	{
		ParaCons p = new ParaCons();
		p.show();
		ParaCons p1 = new ParaCons(5000,15.5f);
		p1.show();
		ParaCons p2 = new ParaCons(10000,19.5f,"MyConstructor",10.654d);
		p2.show();
		ParaCons p3 = new ParaCons(9000,20.5f,"MyConstructor2",10.689d,true);
		p3.show();
		
		
	}

}
