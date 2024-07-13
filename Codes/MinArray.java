import java.util.*;
class MinArray
{
	public static void min(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String args[])
	{
	int i, n;
	
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter no. of elements of array here : ");
	n = sc.nextInt();
	int a[] = new int[n];
	System.out.println("Enter elements of array here : ");
	for(i=0; i<n; i++)
	{
		System.out.print("Enter "+(i+1)+" element here : ");
		a[i] = sc.nextInt();
	}
		min(a);
	}
}