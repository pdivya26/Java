import java.util.*;

class ArrayData
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
		System.out.println("Elements of the array are : ");
		for (i=0; i<n; i++)
		{
		System.out.println(a[i]);
		}
	}
}

class Array
{
	public static void main (String args[])
	{
	ArrayData a1 = new ArrayData ();
	a1.input();	
	a1.output();
	}
}
