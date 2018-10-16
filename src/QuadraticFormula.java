import java.util.Scanner;

public class QuadraticFormula 
{

	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Welcome to the Quadratic Formula Calculator!\nPress Enter to continue.");
		user.nextLine();
		System.out.println("QUADRATIC FORMULA CALCULATOR: ");
		System.out.print("Please enter coefficient \"a\": ");
		String aStr = user.nextLine();
		double aDoub = Double.parseDouble(aStr);
		System.out.print("\nPlease enter coefficient \"b\": ");
		String bStr = user.nextLine();
		double bDoub = Double.parseDouble(bStr);
		System.out.print("\nPlease enter the value \"c\": ");
		String cStr = user.nextLine();
		double cDoub = Double.parseDouble(cStr);
		double root = Math.sqrt(bDoub*bDoub - 4*aDoub*cDoub);
		double solutionOne = ((-1*bDoub+root)/2*aDoub);
		double solutionTwo = ((-1*bDoub-root)/2*aDoub);
		System.out.print("\nThe solutions are: " + solutionOne + ", " + solutionTwo);
		System.out.print("\nThank you for using the Quadratic Formula Calculator!");
		//Completed Project
		
		

	}

}
