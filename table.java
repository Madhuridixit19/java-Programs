package Madhuri;
import java.util.Scanner;

public class table {
	public static void main(String args[]) {
		int n;
		try(Scanner sc=new Scanner(System.in))
		{
		System.out.println("ENTER A NUMBER TO PRINT TABLE");
		n=sc.nextInt();
		sc.close();
	}
		System.out.println("THE TABLE OF "+n +" IS");
	   ptable(n);
}
	public static void ptable (int x) {
		// TODO Auto-generated constructor stub
		for(int i=1;i<=10;i++) {
			int y;
		y=x*i;
		System.out.println(x+"x"+ i +"=" +y);
		}
	}
	}
