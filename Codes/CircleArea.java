import java.util.*;
import java.lang.*;

class CircleData
{
	private double r;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of the circle here : ");
		r = sc.nextDouble();
	}
	public void output()
	{
		double area;
		area = 3.142*Math.pow(r, 2);        // 3.142*r*r
		System.out.print("Area is "+area);
	}
}

class CircleArea
{
	public static void main (String args[])
	{
		CircleData c1 = new CircleData();
		c1.input();
		c1.output();
	}
}