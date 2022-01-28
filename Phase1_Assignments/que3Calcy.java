import java.util.Scanner;

public class que3Calcy {

	 public static void main(String[] args) {

		    char op;
		    
		    Double a, b, result;

		    
		    Scanner input = new Scanner(System.in);    //  object of Scanner class

		 
		    System.out.println("Choose an operator: A , B , C , D , E");
		    op = input.next().charAt(0);

		    	   
		    System.out.println("Enter first number");
		    a = input.nextDouble();

		    System.out.println("Enter second number");
		    b = input.nextDouble();

		    switch (op) {

		      
		      case 'A':
		        result = a + b;
		        System.out.println( "Addtion of two numbres are "+ a + " + " + b + " = " + result);   // addition
		        break;

		      
		      case 'B':
		        result = a - b;
		        System.out.println("Subtraction of two numbres are "+a + " - " + b + " = " + result); // subtraction
		        break;

	   	      case 'C':
		        result = a * b;
		        System.out.println("Multiplication of two numbres are "+a + " * " + b + " = " + result); // multiplication
		        break;

		      
		      case 'D':
		        result = a / b;
		        System.out.println("Division of two numbres are "+a + " / " + b + " = " + result); //division
		        break;

		        
		      case 'E':
			        result = a % b;
			        System.out.println("Modulus of two numbres are "+a + " % " + b+ " = " + result); //modulus
			        break;
			        
			        
		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    input.close();
		  }
		}

