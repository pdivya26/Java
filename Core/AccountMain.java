class Person
{
	private String name;
	private int code;
	public Person(String n, int c)
	{
		name = n;
		code = c;
	}
	public void show()
	{
		System.out.println("Name : "+name);
		System.out.println("Code : "+code);
	}
}//end of data calzzzss

class Account extends Person 
{
	private int sal;
	Account (String n, int c, int s)
	{
		super (n,c);
		sal = s;
	}
	public void show()
	{
		super.show();
		System.out.println("Salary : "+sal);
	}
}//end of class Account 
class AccountMain
{
	public static void main (String args[])
		{
			Account emp = new Account ("Divya",100,80000);
			emp.show();
		}
}//end of main class
