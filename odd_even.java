package Madhuri;
import java.util.Scanner;
public class odd_even {
	public static void main(String args[])
	{
		int a;
		try(Scanner sc= new Scanner(System.in))
		{
			System.out.println("ENETER A NUMBER: ");
			a=sc.nextInt();
			sc.close();
		}
		result(a);
		//even(a);
	}
	public static void result(int x) {
		// TODO Auto-generated constructor stub
		if(x%2!=0)
		System.out.println(x +" IS AN ODD NUMBER") ;
		else
			System.out.println(x +" IS AN EVEN NUMBER") ;
	}
/*public static void even (int y)
{
	if(y%2==0)
		System.out.println(y +" IS AN EVEN NUMBER") ;
	}*/
	}

