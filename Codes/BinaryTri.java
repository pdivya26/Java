import java.util.*;

class BinaryTriData
{
	int i,j,n;
	public void input()
	{
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter no. of rows here : ");
	n = sc.nextInt();
	}
	public void output()
	{
		for (i = 1; i <= n; i++ )
		{
			for (j = 1; j <= i; j++ )
			{
				if ((i + j) % 2== 0)
				{
				System.out.print("1");	
				}
				else
				{
				System.out.print("0");
				}
			}
		System.out.println();
		}
	}
}
class BinaryTri
{
	public static void main (String args[])
	{
		BinaryTriData b1 = new BinaryTriData();
		b1.input();
		b1.output();
	}
}