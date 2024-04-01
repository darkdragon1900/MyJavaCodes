import java.util.Scanner;

class Nest
{
public static void main(String args[])
{
     Scanner ss = new Scanner(System.in);
     int i,j,n;
    
     for(i=1;i<=5;i++)
     {    
          for(j=1;j<=5;j++)
          {
            System.out.print(i+ "   ");
          }
          System.out.println(i + "\n   ");
    }
}

}