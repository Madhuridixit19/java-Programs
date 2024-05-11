package Madhuri;
import java.util.Scanner;
public class swap {
public static void main(String args[]) {
	int a,b;
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("ENTER FIRST NUMBER: ");
		a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER: ");
		b=sc.nextInt();
	sc.close();
	}
	System.out.println("AFTER SWAPPING: ");
	swapping(a,b);
}
	public static void swapping(int x, int y) {
		// TODO Auto-generated constructor stub
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x=" +x);
		System.out.println("y=" +y);
	}

}
