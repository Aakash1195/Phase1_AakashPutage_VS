package Arithmactic_Calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int result;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Value");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Value");
		int b = sc.nextInt();
		System.out.println("Arithmatic Operation Select above ONE ");
		System.out.println(" For Addition Select         1");
		System.out.println(" For Substraction Select     2 ");
		System.out.println(" For Multiplication Select   3");
		System.out.println(" For Division Select         4 ");
		
		char c = sc.next().charAt(0);
		switch(c)
		{
		case '1':
		{
	        result=a+b;
			System.out.println("Addition is "+result);
			break;
		}
		case '2':
		{
			result=a-b;
			System.out.println("Substraction is "+result);
			break;
		}
		case '3':
		{
			result = a*b;
			System.out.println("Multiplication is "+result);
			break;
		}
		case '4':
		{
			result=a/b;
			System.out.println("Divition is "+result);
			break;
		}
	
		default:
		{
			System.out.println("Invalid input");
		}
				
				
		}

	}
}
