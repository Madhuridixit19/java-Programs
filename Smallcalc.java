package Madhuri;
import java.util.Scanner;
public class Smallcalc {

	public static void main(String args[]) {
		int a,b;
		 try( Scanner sc = new Scanner(System.in))
				  {
		  System.out.print("ENTER A NUMBER: ");
		  a=sc.nextInt();
		  System.out.print("ENTER A NUMBER: ");
		  b=sc.nextInt();
		  sc.close();
	}
		 System.out.println("THE SUM OF GIVEN NUMBERS IS: " +add(a,b));
		 System.out.println("THE DIFFERENCE OF GIVEN NUMBERS IS: " +sub(a,b));
		 System.out.println("THE PRODUCT OF GIVEN NUMBERS IS: " +mul(a,b));
		 System.out.println("THE QUOTIENT OF GIVEN NUMBERS IS: " +div(a,b));
		 System.out.println("THE REMAINDER OF GIVEN NUMBERS IS: " +mod(a,b));
		  
	}
	public static int add(int x, int y)
	{
		int z= x+y;
		return z;
	}
	public static int sub(int x, int y)
	{
		if(x>y)
		{
		int z=x-y;
		return z;
		}
		else
		{
			int z=y-x;
			return z;
		}
	}
	public static int mul(int x, int y)
	{
		int z= x*y;
		return z;
	}
	public static int div(int x, int y)
	{
		int z= x/y;
		return z;
	}
	public static int mod(int x, int y)
	{
		int z= x%y;
		return z;
	}
}
