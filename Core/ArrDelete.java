import java.util.*;

class ArrDeleteData
{
	private int a[] = new int[100];
	private int i, p, n;
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number of elements in an array here : ");
		n = sc.nextInt();
		System.out.println("Enter elements of the array here : ");
		for (i=0; i<n; i++)
		{
			System.out.print("Enter "+(i+1)+" element here : ");
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the position of the element to be deleted : ");
		p = sc.nextInt();
	}
	public void output()
	{
		if (p < 0 || p > n - 1)
		{
			System.out.println("Invalid Input");
		}
		else 
			for (i = p ; i < n - 1; i++)
			{
				a[i] = a[i+1];
			}

		for (i = 0; i < n - 1; i++)
		{
			System.out.println(a[i]);
		}
	}
}

class ArrDelete
{
	public static void main (String args[])
	{
		ArrDeleteData d1 = new ArrDeleteData ();
		d1.input();	
		d1.output();
	}
}
