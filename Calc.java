import java.util.Scanner;

public class Calc {

	public static void main(String args[]) {
		
		boolean a = true;
		
		while (a)
		{
			
		System.out.println("Enter false for exit / true for continue ");

		Scanner sc = new Scanner(System.in);
		
		a = sc.nextBoolean();
		
		if (a== false)
			return;
		
		System.out.println("Enter two float(double) numbers:");
		
		
		double d1 = sc.nextDouble();
		
		double d2 = sc.nextDouble();
		
		
		System.out.println("Enter one of these operator : +,-,*,/,%");
		
		char operator = sc.next().charAt(0);
		
		
		if (operator == '+')
		{
			System.out.println(d1+d2);
		}
		else if(operator == '-')
		{
			System.out.println(d1-d2);
		}
		else if (operator == '*')
		{
			System.out.println(d1*d2);
		}
		else if(operator == '/')
		{
			System.out.println(d1/d2);
		}
		else if(operator == '%')
		{
			System.out.println(d1%d2);
		}
		else 
		{
			System.out.println("Choose correct operator");
		}
		
		}
		
		
	}
}
