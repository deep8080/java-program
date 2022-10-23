
import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		
		boolean a = true;
		
		while (a)
		{
			
		System.out.println("Enter false for exit / true for continue ");

		Scanner sc = new Scanner(System.in);
		
		a = sc.nextBoolean();
		
		if (a== false)
			return;
		
		int fact = 1;
		int i =1;
		
		System.out.println("Enter number whose factorial has to calculate :");
		
		
		int num = sc.nextInt();
		
		
		while(i<=num)
		{
			fact = fact*i;
			i++;
		}
		System.out.println("\nfacorial of "+ num +" is : "+ fact);
		
		}
		
	}
}


