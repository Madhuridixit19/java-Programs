package Madhuri;
import java.util.Scanner;
public class learnboolean {
public static void main(String args[]) {
	boolean isalive;
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("ENTER EITHER TRUE OR FALSE: ");
        isalive=sc.nextBoolean();
        sc.close();
	}
	learn(isalive);
}
	public static void learn(boolean a) 
	{
		
		// TODO Auto-generated constructor stub
       if(a) {
    	   System.out.println("ALIVE");
       }
       else
       {
    	   System.out.println("NOT ALIVE");
       }
	}

}

