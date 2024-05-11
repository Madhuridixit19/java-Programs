package Madhuri;
import java.util.Scanner;
public class maxofthreenumber {
	public static void main(String args[]) {
		int a,b,c;
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("ENTER FIRST NUMBER: ");
			a=sc.nextInt();
			System.out.println("ENTER SECOND NUMBER: ");
			b=sc.nextInt();
			System.out.println("ENTER THIRD NUMBER: ");
			c=sc.nextInt();
			sc.close();
		}
		System.out.println("MAXIMUM NUMBER IS: ");
		max(a,b,c);
	}

	public static void max(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		if((x>y)&&(x>z))
			System.out.println(x);
		else if((y>x)&&(y>z))
			System.out.println(y);
		else if((z>x)&&(z>y))
			System.out.println(z);
		else
			System.out.println("ALL NUMBERS ARE EQUAL");
	}

}
