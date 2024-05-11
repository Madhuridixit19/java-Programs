package Madhuri;
import java.util.Scanner;
public class eligible {
public static void main(String args[]) {
	int age;
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("ENTER YOUR AGE: ");
		age=sc.nextInt();
		sc.close();
	}
	         vote(age);
}
	public static void vote(int a) {
		// TODO Auto-generated constructor stub
		if(a>=18)
		{
			System.out.println("YOU ARE ELIGIBLE FOR VOTING");
		}
		else
		{
		  System.out.println("YOU ARE NOT ELIGIBLE FOR VOTING");
		}
	}

}
