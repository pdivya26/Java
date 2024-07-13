import java.util.*;

class LArrData
{
	private int a[];
	private int i,n,lr,slr;
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the size of array here : ");
		n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter the elements of the array here : ");
		for(i = 0; i < n ; i++)
		{
			System.out.print("Enter " +(i+1)+ " element here : ");
			a[i] = sc.nextInt();
		}	
	}
	public void output()
	{
		lr = a[0];
		for (i = 0 ; i < n ; i++)
		{
			if (a[i] > lr)
			{
			lr = a[i];
			}
		}
		slr = a[0];
		for (i = 0 ; i < n ; i++)
		{
			if (a[i] > slr && a[i] < lr)
			{
			slr = a[i] ;
			}
		}
	System.out.print("Largest element is " +lr+ " and second largest element of the array is " + slr);
	}
}

public class LarSecLarArr 
{
	public static void main(String[] args) 
	{
		LArrData l1 = new LArrData();
		l1.input();
		l1.output();
	}

}