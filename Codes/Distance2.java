import java.util.*;
import java.lang.*;

class Distance2
{
	public static void main (String args [])
	{
		double x1,x2,y1,y2;
		double d;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter co-ordinates of first point (x1,y1) here : ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		System.out.print("Enter co-ordinates of second point (x2,y2) here : ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		d = Math.sqrt((x2 -x1)*(y2 -y1) + (x2 -x1)*(y2 -y1));
		System.out.print("Distance is "+d);
	}
}