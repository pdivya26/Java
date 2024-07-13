import java.util.*;

class RightHalfPyrData
{
	int i,j,s,n;
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
			for (s = 1; s <= (n-i); s++ )
			{
				System.out.print("  ");	  //space should be double the space left after the star,
			}
			for (j = 1; j <= i; j++ )
			{
				System.out.print("* ");	
			}
		System.out.println();
		}
	}
}

class RightHalfPyr
{
	public static void main (String args [])
	{
	RightHalfPyrData s1 = new RightHalfPyrData ();
	s1.input();
	s1.output();		
	}
}