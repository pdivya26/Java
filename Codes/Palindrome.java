import java.util.*;

class Palindrome
{
  public static void main(String args[]) 
  {
    int n, m, rev = 0, d,i;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number here: ");
    n = sc.nextInt();
    m = n;
    while (n > 0) 
    {
      d = n % 10;
      rev = rev * 10 + d;
      n = n/10;
    }
    if (rev == m) 
    {
      System.out.println(m + " is a Palindrome.");
    }
    else 
    {
      System.out.println(m + " is not a Palindrome.");
    }
  }
}