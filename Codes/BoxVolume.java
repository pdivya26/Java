import java.util.*;

class Box
{
	private double l, b, h;
	public Box()
	{
		l = 0;
		b = 0;
		h = 0;
	}
	public Box( double m)
	{
		l = b = h = m;
	}
	public Box(double x, double y, double z)
	{
		l = x;
		b = y;
		h = z;
	}
	public void output()
	{
		double area;
		area = l*b*h;
		System.out.println("Area = "+area);
	}
}

class BoxVolume
{
	public static void main (String args[])
	{
		Box b1 = new Box();
		b1.output();
		Box b2 = new Box(30);
		b2.output();
		Box b3 = new Box(10, 20, 40);
		b3.output();
	}
}