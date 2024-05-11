package Madhuri;
import java.util.Scanner;
public class area {
public static void main(String args[]) {
	int side;
	try(Scanner sc=new Scanner(System.in))
	{
	System.out.println("ENTER SIDES IN CM: ");
	side=sc.nextInt();
	sc.close();
	}
	System.out.println("AREA OF SQUARE IS: " +square(side));
	System.out.println("AREA OF PENTAGON IS: "+pentagon(side));
	System.out.println("AREA OF HEXAGON IS: "+hexagon(side));
	System.out.println("AREA OF HEPTAGON IS: "+ heptagon(side));
	System.out.println("AREA OF OCTAGON IS: "+octagon(side));
	System.out.println("AREA OF NENAGON IS: "+nenagon(side));
	System.out.println("AREA OF DECAGON IS: "+decagon(side));
}
	public static int square(int x) {
		 int area=4*x;
		return area;
	}
	public static int pentagon(int x) {
		int area=5*x;
		return area;
	}
	public static int hexagon(int x) {
		int area=6*x;
		return area;
	}
	public static int heptagon(int x) {
		int area=7*x;
		return area;
	}
	public static int octagon(int x) {
		int area=8*x;
		return area;
	}
	public static int nenagon(int x) {
		int area=9*x;
		return area;	}
	public static int decagon(int x) {
		int area=10*x;
		return area;
	}

}
