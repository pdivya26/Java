import java.util.*;

class TriData
{
	private double s1, s2, s3;
	public void input ()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter three sides of the triangle here : ");
		s1 = sc.nextDouble();
		s2 = sc.nextDouble();
		s3 = sc.nextDouble();
	}
	public void output ()
	{
		double sp, area;
		if ((s1 + s2) > s3 && (s2 + s3) > s1 && (s1 + s3) > s2)
			{
			sp = (s1 + s2 +s3)/2;
			area = Math.sqrt(sp*(sp - s1)*(sp - s2)*(sp - s3));
			System.out.print("Area is "+area);
			}
		else
		System.out.print("Triangle is Invalid");
	}
}

class TriArea
{
public static void main (String args[])
	{
		TriData t1 = new TriData();
		t1.input();
		t1.output();
	}
} 
