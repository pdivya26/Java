import java.util.*;

class MatData
{
	private int r, c;
	private int a[][];
	private int b[][];
	private int res[][];
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows of the matrix here : ");
		r = sc.nextInt();
		System.out.print("Enter columns of the matrix here : ");
		c = sc.nextInt();
		a = new int[r][c];
		b = new int[r][c];
		res = new int[r][c];
		System.out.println("Enter elements of the matrix here : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("Enter ("+(i+1)+","+(j+1)+") element of Matrix A here : ");
				a[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("Enter ("+(i+1)+","+(j+1)+") element of Matrix B here : ");
				b[i][j] = sc.nextInt();
			}
		}
	}
	public void output()
	{
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}

		System.out.println();

		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();

		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				res[i][j] = a[i][j] + b[i][j];
			}
		}

		System.out.println("Sum of the matrix is : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(res[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}

class MatAdd
{
	public static void main(String args[])
	{
		MatData m = new MatData();
		m.input();
		m.output();
	}
}