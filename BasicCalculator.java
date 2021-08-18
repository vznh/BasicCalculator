
import java.util.Scanner; /* i realize when you put this in Eclipse IDE, it shows like 29 errors but still works as intended w/ no issue in any of the functions
* but still works as intended w/ no issue in any of the functions
*/

public class BasicCalculator {
	
private static final String Multiply = null;
	private static final String Add = null;
	private static final String Subtract = null;
	private static final String Divide = null;

	public static void main(String[] args) {
		BasicCalculator mainObject = new BasicCalculator();
		mainObject.Calculator();
	}
	
	public void Calculator() {
		double firstInput;
		double secondInput;
		double answer;
		String f1 = "Multiply"; // f stands for function
		String f2 = "Add";
		String f3 = "Subtract";
		String f4 = "Divide";
		String end = "a) Multiply \nb) Add \nc) Subtract \nd) Divide";
		
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		firstInput = read.nextDouble();
		System.out.println("Enter your second number: ");
		secondInput = read.nextDouble();
		System.out.println("What would you like to do?");
		System.out.println(end);
		String operator = read.next();
		
		if(operator.equals("a")) {
			answer = firstInput * secondInput;
			System.out.println(firstInput + " * " + secondInput + "\n" + answer);
		}
		else if(operator.equals("b")) {
			answer = firstInput + secondInput;
			System.out.println(firstInput + " + " + secondInput + "\n" + answer);
		}
		else if(operator.equals("c")) {
			answer = firstInput - secondInput;
			System.out.println(firstInput + " - " + secondInput + "\n" + answer);
		}
		else if(operator.equals("d")) {
			answer = firstInput / secondInput;
			System.out.println(firstInput + " / " + secondInput + "\n" + answer);
		}
		else
			System.out.println("bad input");
		
	}

}
