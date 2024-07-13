import java.util.*;

class SArrData
{
	int i, n, sm, ssm;
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
	sm = a[0];
	for(i = 0; i < n; i++)
	{
		if (a[i] < sm)
		{
		sm = a[i];
		}
	}
	ssm = a[0];
	for(i = 0; i < n; i++)
	{
		if (a[i] < ssm && a[i] > sm)
		{
		ssm = a[i];
		}
	}
	System.out.print("Smallest element is " +sm+ " and second smallest element of the array is " + ssm);
	}
}

class SmlSecSmlArr
{
	public static void main (String args[])
	{
		SArrData s1 = new SArrData();
		s1.input();
		s1.output();
	}
}