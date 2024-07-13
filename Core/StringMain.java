import java.util.*;

class StringData
{
	private String s, s1, s2;
	private int ind;
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter any String : ");
		//s = sc.nextLine();
		//System.out.println("Enter index of the character to be displayed : ");
		//ind = sc.nextInt();
		System.out.println("Enter first String : ");
		s1 = sc.nextLine();
		System.out.println("Enter second String : ");
		s2 = sc.nextLine();
	}	
	public void output()
	{
		int i,j,len;
		char t;
		
		//System.out.println("Your String = "+s);
		//System.out.println("Length of the String = "+s.length());
		//System.out.println("Uppercase = "+s.toUpperCase());
		//System.out.println("Lowercase = "+s.toLowerCase());
		//System.out.println("Character at Index "+ind+" = "+s.charAt(ind-1));
		//System.out.println(s.contains("k"));
		//System.out.println("First Index Of 'k' = "+s.indexOf('k'));  // first occurance
		//System.out.println("Last Index Of 'k' = "+s.lastIndexOf('k'));  // last occurance
		/*len = s.length();
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
		System.out.println(s); */
		System.out.println(s1.compareTo(s2));
	}	
}

class StringMain
{
	public static void main (String args[])
	{
		StringData x = new StringData();
		x.input();
		x.output();
	}
}