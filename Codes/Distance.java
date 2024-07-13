import java.util.*;

class Distance 
{
	public static void main (String args[])
		{
			int x1,x2,y1,y2;
			double dist;
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter value of 'x1' here : ");
			x1 = sc.nextInt();
			System.out.print("Enter value of 'y1' here : ");
			y1 = sc.nextInt();
			System.out.print("Enter value of 'x2' here : ");
			x2 = sc.nextInt();
			System.out.print("Enter value of 'y2' here : ");
			y2 = sc.nextInt();
			
			dist = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

			System.out.print("Distance between ("+x1+"," +y1+") and (" +x2+ "," +y2+ ") is " +dist);
		}
}