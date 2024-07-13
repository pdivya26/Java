import java.util.*;

class StringData
{
	private String s;
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any String : ");
		s = sc.nextLine();
	}
	public void output()
	{
		int i,j,len;
		char t;
		
		len = s.length();
		char c[] = new char [len];
		c = s.toCharArray();
		j = len - 1;
		for(i=0; i < len/2; i++)
		{
			t = c[i];
			c[i] = c[j];
			c[j] = t;
			j--;
		}
		String rev = new String(c);
		System.out.println("Reversed String = "+rev);
		if (s.equalsIgnoreCase(rev) == true)      // s.equals () is case-sensitive where as s.equalsIgnoreCase is not case-sensitive.
		{
			System.out.println("String is a Palindrome");
		}
		else
		{
			System.out.println("String is not a Palindrome");
		}
	}
}

class StringPal
{
	public static void main (String args[])
	{
		StringData x = new StringData();
		x.input();
		x.output();
	}
}