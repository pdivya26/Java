import java.util.*;

class Book
{
	String name;
	int code;
	Book(String n, int c)
	{
		name = n;
		code = c;
	}
	public void show()
	{
		System.out.println("\nName : " +name);
		System.out.println("Code : " +code);
	}
}

class Bk1 extends Book
{
	String publication;
	Bk1(String n, int c, String p)
	{
	super(n,c);
	publication = p;
	}
	public void show()
	{
	super.show();
	System.out.println("Publication : " +publication);
	}
}

class Bk2 extends Book
{
	String genre;
	Bk2(String n, int c, String g)
	{
	super(n,c);
	genre = g;
	}
	public void show()
	{
	super.show();
	System.out.println("Genre : " +genre);
	}
}

class Bk3 extends Book
{
	String author;
	Bk3(String n, int c, String a)
	{
	super(n,c);
	author = a;
	}
	public void show()
	{
	super.show();
	System.out.println("Author : " +author);
	}
}

class BookMain
{
	public static void main(String args [])
	{
	Book b = new Book ("Advanced Java", 4578);
	b.show();
	Bk1 b1 = new Bk1 ("Atomic Habits", 1331, "Penguin Random House");
	b1.show();
	Bk2 b2 = new Bk2 ("The Chronicles of Narnia", 8266, "Fantasy");
	b2.show();
	Bk3 b3 = new Bk3 ("Harry Potter", 7777, "J.K. Rowling");
	b3.show();
	}
}