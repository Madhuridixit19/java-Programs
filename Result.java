package Madhuri;
import java.util.Scanner;
public class Result {
	public static void main(String args[]) 
	    {
		float a,b,c,d,e;
		try (Scanner sc= new Scanner(System.in))
		    {
			System.out.println("ENTER ALL THE MARKS OF GIVEN SUBJECTS: ");
			System.out.println("HINDI: ");
			a=sc.nextFloat();
			System.out.println("ENGLISH: ");
			b=sc.nextFloat();
			System.out.println("MATHEMATICS: ");
			c=sc.nextFloat();
			System.out.println("SCIENCE: ");
			d=sc.nextFloat();
			System.out.println("SOCIAL SCIENCE: ");
			e=sc.nextFloat();
			sc.close();
			}
		float total=a+b+c+d+e;
		System.out.println("THE TOTAL OF ALL SUBJECTS IS: " +total);
		System.out.println("PERCENTAGE IS: "+ r(total));
		}
	public static float r(float x)
	   {
		float per= (x/500)*100;
	 if(per>=60) 
		    {
			System.out.println("FIRST DIVISION");
			}
		else if(per>=50 && per<60)
		    {
		    System.out.println("SECOND DIVISION");
		    }
		else if(per>=33 && per<50)
		    {
			System.out.println("THIRD DIVISION");
			}
		else
		    {
			System.out.println("FAIL");
		    }
	 return per;
}}