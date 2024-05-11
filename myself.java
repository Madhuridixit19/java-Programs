package Madhuri;
import java.util.Scanner;
public class myself {
public static void main(String args[]) {
	String name,gender;
	int age,grade;
	float percentage;
		try(Scanner sc=new Scanner(System.in))
		{
		System.out.println("ENTER YOUR GENDER: ");
		gender=sc.nextLine();
		System.out.println("ENTER YOUR NAME: ");
		name=sc.nextLine();
		System.out.println("ENTER YOUR AGE: ");
		age=sc.nextInt();
		System.out.println("ENTER YOUR CLASS: ");
		grade=sc.nextInt();
		System.out.println("ENTER YOUR PERCENTAGE: ");
		percentage=sc.nextFloat();
		sc.close();}
	getInfo(gender,name,age,grade,percentage);
}
public static void getInfo(String g, String n, int a, int gr, float p) {
	
		// TODO Auto-generated constructor stub
      System.out.println("I AM A " + g);
      System.out.println("MY NAME IS  " + n);
      System.out.println("I AM " + a + " YEARS OLD");
      System.out.println("I READ IN CLASS "+ gr);
      System.out.println("I SCORED " + p +" PERCENTAGE");
	}
}