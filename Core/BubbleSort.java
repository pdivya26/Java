import java.util.*;

class SortData
{
	private int a[] = new int[100];
	private int i,n;
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
	}
	public void output()
	{
		int i, j, swap; 
		System.out.println("Elements of the array are : ");
		for (i=0; i<n-1; i++)
		{
			for (j=0; j<n-i-1; j++)
			{
				if (a[j] > a[j+1])
				{
				swap = a[j];
				a[j] = a[j+1];
				a[j+1] = swap;
				}			
			}
		}
		for (i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
	}
}

class BubbleSort
{
	public static void main (String args[])
	{
	SortData b1 = new SortData ();
	b1.input();	
	b1.output();
	}
}