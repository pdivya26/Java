import java.util.*;

class HRData
{
	int i,j,r,c;
	public void input()
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter no. of rows here : ");
		r = sc.nextInt();
		System.out.print("Enter no. of columns here : ");
		c = sc.nextInt();
	}
	public void output()
	{
		for (i = 1; i <= r; i++ )
		{
			for (j = 1; j <= c; j++ )
			{
				if (i == 1 || i == r || j == 1 || j == c)
				{
				System.out.print("* ");	
				}
				else
				{
				System.out.print("  ");
				}
			}
		System.out.println();
		}
	}
}

class HollowRectStar
{
	public static void main (String args [])
	{
	HRData s1 = new HRData ();
	s1.input();
	s1.output();		
	}
}