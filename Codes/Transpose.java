/*
Name :- Divya Ganesh Poojari
Branch :- INFT	Div :- A
Rollno. :- 22101A0046 
Topic :- Transpose Of A Matrix (2D Array)
*/

import java.util.*;

class TransposeData
{
	private int r, c;
	private int m[][];
	private int t[][];
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows of the matrix here : ");
		r = sc.nextInt();
		System.out.print("Enter columns of the matrix here : ");
		c = sc.nextInt();
		m = new int[r][c];
		t = new int[c][r];
		System.out.println("Enter elements of the matrix here : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print("Enter ("+(i+1)+","+(j+1)+") element here : ");
				m[i][j] = sc.nextInt();
			}
		}
	}
	public void output()
	{
		System.out.print("Original Matrix is : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print(m[i][j]+" ");
				
			}
			System.out.println();
		}
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				t[i][j] = m[j][i];
			}	
		}

		System.out.println("Transpose of the matrix is : ");
		for(int i=0; i<c; i++)
		{
			for(int j=0; j<r; j++)
			{
				System.out.print(t[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

class Transpose
{
	public static void main(String args[])
	{
		TransposeData t = new TransposeData();
		t.input();
		t.output();
	}
}