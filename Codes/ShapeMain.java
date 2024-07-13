import java.lang.Math;

import java.util.*;

abstract class Shape
{
	double radius;
	Shape()
	{
		radius = 0;
	}
	Shape(double r)
	{
		radius = r;
	}
	public abstract void volume();
}

class Sphere extends Shape
{
	public Sphere(double r)
	{
		radius = r;
	}
	public void volume()
	{
		double vol = 1.333*Math.PI*radius*radius*radius;
		System.out.println("Volume of Sphere = "+vol);
	}
}

class Cylinder extends Shape
{
	double length;
	public Cylinder(double r, double l)
	{
		radius = r;
		length = l;
	}
	public void volume()
	{
		double vol = Math.PI*radius*radius*length;
		System.out.println("Volume of Cylinder = "+vol);
	}
}

class ShapeMain
{
	public static void main(String args[])
	{
		Shape s;
		Sphere sp = new Sphere(10);
		Cylinder cy = new Cylinder(5,4);
		s = sp;
		s.volume();
		s = cy;
		s.volume();
	}
}

