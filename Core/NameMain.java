import java.util.*;

class NameData
{
	String s[];
	int n;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names : ");
		n = sc.nextInt();		
		sc.nextLine();
		s = new String[n];
		System.out.println("Enter names : ");
		for (int i = 0; i < n; i++)
		{
			s[i] = sc.nextLine();
		}
	}
	public void sort()
	{
		String t;
		int i,j;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n-1; j++)
			{
				if(s[j].compareTo(s[j+1]) > 0)
				{
					t = s[j];
					s[j] = s[j+1];
					s[j+1] = t;
				}
			}
		}
		System.out.println("Alphabetical order : ");
		for (i = 0; i < n; i++)
		{
			System.out.println(s[i]);
		}
	}
}

class NameMain
{
	public static void main (String args[])
	{
		NameData x = new NameData();
		x.input();
		x.sort();	
	}
}