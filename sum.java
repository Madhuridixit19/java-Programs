package Madhuri;
import java.util.Scanner;
public class sum {
public static void main(String args[]) {
	int n;
	try(Scanner sc=new Scanner(System.in))
	{
		System.out.println("ENTER A NUMBER: ");
		n=sc.nextInt();
	sc.close();	
	}
	System.out.println("THE SUM IS: "+add(n));
}

	public static int add(int x){
		int sum=0;
		// TODO Auto-generated constructor stub
for(int i=1;i<=x;i++)
{
	sum=sum+i;
}
	return sum;
	}
	}