package Madhuri;
import java.util.Scanner;
public class primeno {
public static void main(String args[]) {
	int n;
	try(Scanner sc=new Scanner(System.in))
{ 
		System.out.println("ENTER A NUMBER: ");
		n=sc.nextInt();
	sc.close();}
	prime(n);
}
public static void prime(int a) {
	int i;
	int flag=0;       //for Prime number
		if(a==0||a==1)                  // for not prime number
			flag=1;                    // for not prime number
		for(i=2;i<=a/2;++i)           // for not prime number
		{							 // for not prime number
			if(a%i==0) {			// for not prime number
				flag=1;     	   // for not prime number
				break;
			}}
		if(flag==0)
		{
			System.out.println(a+ " IS A PRIME NUMBER");
		}
		else
		{
			System.out.println(a+ " IS NOT A PRIME NUMBER");
	}
		}
}
