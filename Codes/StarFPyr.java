class StarFPyr
{
	public static void main (String args[])
	{
		int n=5,i,j,s;
		for(i=1;i<=n;i++)
		{
				for(s=i;s<n;s++)
					{
						System.out.print(" ");
					}

				for(j=1;j<=(2*i-1);j++)    // for odd number of stars use j = (2*i - 1), for even number of stars use j  = i
					{
						System.out.print("*");
					}
				System.out.println();
		}
	}
}