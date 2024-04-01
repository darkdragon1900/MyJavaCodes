package java_basic2;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
    Scanner ss=new Scanner(System.in);
    int num;
    int ch;
    System.out.println("*********MENU**********");
    
    System.out.println("1.Square of num 2.Cube of num");
    System.out.println("Enter your choice");
    ch=ss.nextInt();
    switch(ch)
    {
    case 1:
    	System.out.println("Enter a num");
    	num=ss.nextInt();
    	System.out.println("Square of num is "+ num*num);
    	break;
    	
    case 2:
    	System.out.println("Enter a num");
    	num=ss.nextInt();
    	System.out.println("Square of num is "+ num*num*num);
    	break;
    
    default :
    	System.out.println("Wrong choice");
    	
    }
	}

}
