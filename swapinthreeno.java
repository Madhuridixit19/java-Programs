package Madhuri;
import java.util.Scanner;
public class swapinthreeno {
public static void main(String args[]) {
	int a,b,c;
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("ENTER FIRST NUMBER: ");
		a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER: ");
		b=sc.nextInt();
		System.out.println("ENTER THREE NUMBER: ");
		c=sc.nextInt();
	sc.close();
	}
	System.out.println("AFTER SWAPPING: ");
	swapping(a,b,c);
	
}
	public static void swapping(int x, int y, int z) {
		// TODO Auto-generated constructor stub
		x=x+y+z;
		y=x-(y+z);
		z=x-(y+z);
		x=x-(y+z);
		System.out.println("a: "+ x);
		System.out.println("b: "+ y);
		System.out.println("c: "+ z);
	}

}
