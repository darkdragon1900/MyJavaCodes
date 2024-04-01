//array reverse without 3rd variable
package arrays;

public class ReverseArray {
	
	public static void main(String arg[])
	{
		int a[]= {1,2,3,4,5,6};
		int start =0;
		int end=5;
		while(start<end)
		{
			a[start]=a[start]+a[end];
			a[end]=a[start]-a[end];
			a[start]=a[start]-a[end];
			start++;
			end--;
		}
		
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}

}
