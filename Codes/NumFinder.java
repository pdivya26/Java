import java.util.*;

class NumFinderData
{
	int i,n,x;
	int a[];
	public void input()
	{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter size of array here : ");
	n = sc.nextInt();
	a = new int [n];
	System.out.println("Enter elements of the array : ");
	for (i = 0; i < n; i++ )
		{
			System.out.print("Enter "+(i+1)+" elements here : ");
			a[i] = sc.nextInt();
		}

	System.out.print("Enter number to be found in the array here : ");
	x = sc.nextInt();
	}
	public void output()
	{
	System.out.println("Size of the array = " +a.length);	
		for(i = 0; i < n; i++ )
		{
			if(a[i] == x)
				{
					System.out.print(x + " is at index "+ i);	
				}
		}
	}
}

class NumFinder
{
	public static void main (String args[])
	{
		NumFinderData d1 = new NumFinderData();
		d1.input();
		d1.output();
	}
}