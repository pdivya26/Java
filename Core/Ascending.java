import java.util.*;

class AscendingData
{
	int i, j, n;
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
		int t;
		for(i = 0; i < n-1; i++)
		{
			for(j = 0; j < n-i-1; j++)
			{
				if (a[j] > a[j+1] )
				{
					t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	System.out.println("Elements in ascending order are : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i]+ "\t");
		}
	}
}

class Ascending
{
	public static void main (String args[])
	{
		AscendingData a = new AscendingData();
		a.input();
		a.output();
	}
}