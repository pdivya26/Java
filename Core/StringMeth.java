import java.util.*;

class StringData
{
	private String s;
	private int in;
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any String : ");
		s = sc.nextLine();
		System.out.println("Enter index of the character to be displayed : ");
		in = sc.nextInt();
	}	
	public void output()
	{	
		System.out.println("Your String = "+s);
		System.out.println("Length of the String = "+s.length());
		System.out.println("Uppercase = "+s.toUpperCase());
		System.out.println("Lowercase = "+s.toLowerCase());
		System.out.println("Character at Index "+in+" = "+s.charAt(in));
		System.out.println(s.contains("k"));
		System.out.println("First Index Of 'k' = "+s.indexOf('k'));  // first occurance
		System.out.println("Last Index Of 'k' = "+s.lastIndexOf('k'));  // last occurance
	}	
}

class StringMeth
{
	public static void main (String args[])
	{
		StringData x = new StringData();
		x.input();
		x.output();
	}
}