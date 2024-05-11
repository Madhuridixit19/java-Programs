package Madhuri;
import java.util.Scanner;
public class reverse {
public static void main(String args[])
	{
		int n;
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("ENTER A NUMBER: ");
	      n= sc.nextInt();
		}
		System.out.println("THE NUMBER AFTER REVERSEING IS: "+revers(n));
	}
	public static int revers(int x) {
		// TODO Auto-generated constructor stub
		int rev=0;
		while(x!=0)
		{
			int rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		return rev;
}
}
