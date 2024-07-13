import java.util.*;

class FloydTriData
{
	int i,j,n;
	int num = 1;
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

				System.out.print(num + " ");
				num++;
			}
		System.out.println();
		}
	}
}
class FloydTri
{
	public static void main (String args[])
	{
		FloydTriData f1 = new FloydTriData();
		f1.input();
		f1.output();
	}
}