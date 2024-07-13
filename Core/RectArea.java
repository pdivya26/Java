import java.util.*;

class RectData
{
	private double l, b;
	public void input ()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter length & breadth of the rectangle here : ");
		l = sc.nextDouble();
		b = sc.nextDouble();
	}
	public void output ()
	{
		double area;
		area = l*b;
		System.out.print("Area is "+area);
	}
}

class RectArea
{
	public static void main (String args[])
	{
		RectData r1 = new RectData();
		r1.input();
		r1.output();
	}
} 
