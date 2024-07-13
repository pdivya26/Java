import java.util.*;

class StudentData
{
	String name;
	int rn;
	double per;
	public void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter name, rollno and percentage here  : ");
		name = sc.nextLine();
		rn = sc.nextInt();
		per = sc.nextDouble();
	}
	public static void sort(StudentData s[], int n)
	{
	StudentData t = new StudentData();
	int i,j;
	for(i=0; i<n; i++)
	{
		for(j=0; j<n-1; j++)
		{
			if (s[j].name.compareTo(s[j+1].name)>0)
			{
				t = s[j];
				s[j] = s[j+1];
				s[j+1] = t;
			}
		}
	}
	}
	public void output()
	{
		System.out.println(name+ "\t"+rn+"\t"+per);
	}
}

class StudentMain
{
	public static void main (String args[])
	{
		int i,n;
		Scanner sc = new Scanner (System.in);
		System.out.println("How many student's data do you want to enter : ");
		n = sc.nextInt();
		StudentData s[] = new StudentData[n];
		for(i=0; i<n; i++)
		{
			s[i] = new StudentData();
			s[i].input();
		}
		StudentData.sort(s,n);
		System.out.println("Name\tRollno\tMarks");
		for(i=0; i<n; i++)
		{
			s[i].output();
		}
	}
}

/* to display data in descending order of marks 
for(j=0; j<n-1; j++)
		{
			if (s[j].name.compareTo(s[j+1].name)>0)
			{
				t = s[j];
				s[j] = s[j+1];
				s[j+1] = t;
			}
		}
*/