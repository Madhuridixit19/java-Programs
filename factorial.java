package Madhuri;
import java.util.Scanner;
public class factorial {
public static void main(String args[]) {
	int n;
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("ENTER A NUMBER: ");
		n=sc.nextInt();
		sc.close();
	}
	
	fact(n);
}
	public static void fact(int x) {
		// TODO Auto-generated constructor stub
		int f=1;
		for(int i=x;i>0;i--)
		{
			f=f*i;
		}
		System.out.println("THE FACTORIAL OF "+x+" IS: "+ f);
	}

}
