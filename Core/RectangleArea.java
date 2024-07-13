class    RectangleData
{
	public  double  l, b;
	public   RectangleData()
	{
		l = 0;
		b = 0;
	}
	public   RectangleData(double len, double bre)
	{
		l = len;
		b = bre;
	}
	public   RectangleData(RectangleData x)
	{
		l = x.l+5;
		b = x.b+5;
	}
	public void output()
	{
		double area;
		area = l*b;
		System.out.println("Area = "+area);
	}
}

public class RectangleArea
{
	public static void main(String args[]) 
	{
		RectangleData  r1 = new  RectangleData();
		RectangleData  r2 = new  RectangleData(2.5, 10);
		RectangleData  r3 = new  RectangleData(r2);
		r1.output();
		r2.output();
		r3.output();
	}
}
