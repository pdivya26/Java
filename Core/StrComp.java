import java.util.*;

class StringData
{
	private String s1, s2;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		s1 = sc.nextLine();
		System.out.println("Enter second String : ");
		s2 = sc.nextLine();
	}
	public void output()
	{
		System.out.println(s1.compareTo(s2));
	}
}

class StrComp
{
	public static void main(String args[])
	{
		StringData x = new StringData();
		x.input();
		x.output();
	}
}