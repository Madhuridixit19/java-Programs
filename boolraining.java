package Madhuri;
import java.util.Scanner;
public class boolraining {
	
public static void main(String args[]) 
{
	boolean rain;
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("ENTER EITHER TRUE OR FALSE");
		rain=sc.nextBoolean();
	}
	raining(rain);
}
	public static void raining(boolean r) {
		// TODO Auto-generated constructor stub
		if(r==true) {
			System.out.println("IT'S RAINING OUTSIDE\nBRING UMBRELLA WITH YOU!!");
	}else
	{
		System.out.println("IT'S NOT RAINING OUTSIDE\nENJOY SUNSHINE!!");
	}	
	}
}
