import java.util.*;

class DescendingData
{
	int i, j, n, t;
	int a[];
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter size of the array here : ");
		n = sc.nextInt();
		a = new int [n];
		System.out.println("Enter elements of the array here : ");
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter " +(i+1)+ " element here : ");
			a[i] = sc.nextInt();
		}
	}
	public void output()
	{
	for(i = 0; i < n-1; i++)
	{
		for(j = 0; j < n-i-1; j++)
		{
			if (a[j] < a[j+1] )
			{
			t = a[j];
			a[j] = a[j+1];
			a[j+1] = t;
			}
		}
	}
		System.out.print("Elements in descending order are : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i]+ "\t");
		}
	}
}

class Descending
{
	public static void main (String args[])
	{
		DescendingData d1 = new DescendingData();
		d1.input();
		d1.output();
	}
}