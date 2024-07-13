import java.util.*;

class Box
{
	double length, breadth, height;
	public Box(double l, double b, double h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	public void vol()
	{
		double vol = length*breadth*height;
		System.out.println("Volume of the Shipment : "+vol);
	}
}

class Weight extends Box
{
	double weight;
	public Weight(double l, double b, double h, double k)
	{
		super(l,b,h);
		super.vol();
		weight = k;
	}
}

class Cost extends Weight
{
	double rate;
	public Cost(double l, double b, double h, double k, double r)
	{
		super(l,b,h,k);
		rate = r;
	}
	public void output()
	{
		double cost = weight*rate;
		System.out.println("Overall cost of the Shipment : "+cost);
	}
}

class ShipmentPrice
{
	public static void main(String args[])
	{
		Cost c = new Cost(5.0, 4.5, 6.2, 100.0, 145.6);
		c.output();
	}
}