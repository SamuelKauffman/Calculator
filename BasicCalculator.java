import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float A, B, C, D, res=0;
		
		String choice;
		Scanner scan = new Scanner(System.in);
		
		do {
			// prepare the menu for user
		System.out.println("\n\nMain menu: \n1.Addition\n2.Subtraction" + "\n3.Multiplication\n4.Division" + "\n5.Square Root\n6.Sin" + "\n7.Cos\n8.Tan" + "\n9.Natural Log\n10.Squared" + "\n11.Cubed\n12.Exponents" + "\n13.Area\n14.Log10" + "\n15.Log\n16.Quadratic Formula" + "\n17.Adding Numbers with Exponents\n18.Subtrating Numbers with Exponents" + "\n19.Multiplying Numbers with eponents\n20.Dividing Numbers with Exponents" + "\nq Quit\n");
		
		System.out.println("Enter your choice: ");
		choice= scan.next();
		
		switch(choice) {
		
		case "1": 
			System.out.println("Enter 2 numbers: ");
			A = scan.nextFloat();
			B = scan.nextFloat();
			
			res = A+B;
			System.out.println("Result: " + res);
			break;
		case "2":
			System.out.println("Enter 2 numbers: ");
			A = scan.nextFloat();
			B = scan.nextFloat();
			
			res = A-B;
			System.out.println("Result: " + res);
			break;
		case "3":
			System.out.println("Enter 2 numbers: ");
			A = scan.nextFloat();
			B = scan.nextFloat();
			
			res = A*B;
			System.out.println("Result: " + res);
			break;
		case "4":
			System.out.println("Enter 2 numbers: ");
			A = scan.nextFloat();
			B = scan.nextFloat();
			
			res = A/B;
			System.out.println("Result: " + res);
			break;
		case "5":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = (float) Math.sqrt(A);
			System.out.println("Result: " + res);
			break;
		case "6":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = (float) Math.sin(A);
			System.out.println("Result: " + res);
			break;
		case "7":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = (float) Math.cos(A);
			System.out.println("Result: " + res);
			break;
		case "8":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = (float) Math.tan(A);
			System.out.println("Result: " + res);
			break;
		case "9":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = (float) Math.log(A);
			System.out.println("Result: " + res);
			break;
		case "10":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = A*A;
			System.out.println("Result: " + res);
			break;
		case "11":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = A*A*A;
			System.out.println("Result: " + res);
			break;
		case "12":
			System.out.println("Enter your base number: ");
			A = scan.nextFloat();
			System.out.println("Enter your exponent: ");
			B = scan.nextFloat();
			res = (float) Math.pow(A, B);
			System.out.println("Result: " + res);
			break;
		case "13":
			System.out.println("Enter length: ");
			A = scan.nextFloat();
			System.out.println("Enter width: ");
			B = scan.nextFloat();
			System.out.println("Enter height: ");
			C = scan.nextInt();
			res = A*B*C;
			System.out.println("Result: " + res);
			break;
		case "14":
			System.out.println("Enter 1 number: ");
			A = scan.nextFloat();
			res = (float) Math.log10(A);
			System.out.println("Result: " + res);
			break;
		case "15":
			System.out.println("Enter log A: ");
			A = scan.nextFloat();
			System.out.println("Enter log B: ");
			B = scan.nextFloat();
			res = (float) ((float) (Math.log(A))/(Math.log(B)));
			System.out.println("Result: " + res);
			break;
		case "16":
			System.out.println("Enter A: ");
			A = scan.nextFloat();
			System.out.println("Enter B: ");
			B = scan.nextFloat();
			System.out.println("Enter C: ");
			C = scan.nextFloat();
			double Num1= ((-1*B) - Math.sqrt(Math.pow(B, 2) - (4*A*C))/(2*A));
			double Num2= ((-1*B) + Math.sqrt(Math.pow(B, 2) - (4*A*C))/(2*A));
			System.out.println(Num1);
			System.out.println(Num2);
			break;
		case "17":
			System.out.println("Enter first number: ");
			A = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			B = scan.nextFloat();
			System.out.println("Enter second number: ");
			C = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			D = scan.nextFloat();
			res = (float) (Math.pow(A, B)+Math.pow(C, D));
			System.out.println("Result: " + res);
			break;
		case "18":
			System.out.println("Enter first number: ");
			A = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			B = scan.nextFloat();
			System.out.println("Enter second number: ");
			C = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			D = scan.nextFloat();
			res = (float) (Math.pow(A, B)-Math.pow(C, D));
			System.out.println("Result: " + res);
			break;
		case "19":
			System.out.println("Enter first number: ");
			A = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			B = scan.nextFloat();
			System.out.println("Enter second number: ");
			C = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			D = scan.nextFloat();
			res = (float) (Math.pow(A, B)*Math.pow(C, D));
			System.out.println("Result: " + res);
			break;
		case "20":
			System.out.println("Enter first number: ");
			A = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			B = scan.nextFloat();
			System.out.println("Enter second number: ");
			C = scan.nextFloat();
			System.out.println("Enter exponent of first number: ");
			D = scan.nextFloat();
			res = (float) (Math.pow(A, B)/Math.pow(C, D));
			System.out.println("Result: " + res);
			break;
		case "q":
			System.exit(0);
			break;
		default:
			System.out.println("The choice is invalid!");
			break;
			
		}
		}
		while(choice!="q");
			
	}

}
