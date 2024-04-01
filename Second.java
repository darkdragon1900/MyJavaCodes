import java.util.Scanner;

class Second
{
public static void main(String args[])
{
Scanner ss = new Scanner(System.in);

int i , j,x;

for(i=1;i<=5;i++)
{
x=i;
for (j=1;j<=i;j++)
{

System.out.print(x+"\t");
x++;
}
System.out.println();
}

}
}