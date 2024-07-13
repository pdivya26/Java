import java.util.*;

class Division
{
	public static void main(String args[])
	{
		int a, b, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of 'a' & 'b' here: ");
		a = sc.nextInt();
		b = sc.nextInt();
		try
		{
			c = a/b;
		}
		catch(Exception e)
		{
			System.out.println("Error : '"+e+".'");
		}
		finally
		{
			System.out.println("The two numbers entered is "+a+" and "+b);
		}
		System.out.println("Quotient is "+c);
	}
}