import java.util.*;

class ClockRotData
{
	private int i, j, p, n, f;
	private int a[];
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of elements in an array here : ");
		n = sc.nextInt();
		a = new int[100];
		System.out.println("Enter elements of the array here : ");
		for (i=0; i<n; i++)
		{
			System.out.print("Enter "+(i+1)+" element here : ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the no. of positions to be shifted  by here : ");
		p = sc.nextInt();
	}
	public void output()
	{
		
		for (i = 0; i < p; i++)
		{	
			f = a[0];
			for (j = 0; j < n; j++)
			{
				a[j] = a[j+1];
			}
			a[n-1] = f;
		}	
		for (i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}
}

class ClockRot
{
	public static void main (String args[])
	{
		ClockRotData c1 = new ClockRotData ();
		c1.input();	
		c1.output();
	}
}