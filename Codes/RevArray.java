import java.util.*;

class RevArrayData
{
	private int a[];
	private int i,n;
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
	}
	public void output()
	{
		System.out.println("Elements of the array in reverse order are : ");
		
		for ( i= (n-1); i >= 0; i--)
		{
		System.out.println(a[i]);
		}
	}
}

class RevArray
{
	public static void main (String args[])
	{
	ArrayData a1 = new ArrayData ();
	a1.input();	
	a1.output();
	}
}


	/* Alternate Method
	for (i=0; i<n; i++)
	{
	System.out.println(a[n-i-1]);
	} */