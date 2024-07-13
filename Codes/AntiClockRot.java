import java.util.*;

class AntiClockRotData
{
	private int i, j, p, n, l;
	private int a[];
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of elements in an array here : ");
		n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter elements of the array here : ");
		for (i=0; i<n; i++)
		{
			System.out.print("Enter "+(i+1)+" element here : ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the no. of positions to be shifted by here : ");
		p = sc.nextInt();
	}
	public void output()
	{
		for (i = 0; i < p; i++)
		{
			l = a[n-1];
			for (j = n-1 ; j > 0 ; j--)
			{
				a[j] = a[j-1];
			}
			a[0] = l;
		}	
		for (i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}
}

class AntiClockRot
{
	public static void main (String args[])
	{
		AntiClockRotData c1 = new AntiClockRotData ();
		c1.input();	
		c1.output();
	}
}