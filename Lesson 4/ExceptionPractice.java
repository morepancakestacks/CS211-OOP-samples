import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionPractice {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			int number = input.nextInt();

			System.out.print("Enter a divisor: ");
			int divisor = input.nextInt();

			int result = number/divisor;

			int [] values = {9, 8, 12, 15, 14};
			System.out.println("Value: " + values[result]);
		}
		catch (InputMismatchException e) {
			System.out.println("Catch 1: Invalid input!");
		}
		catch (ArithmeticException e) {
			System.out.println("Catch 2: Arithmetic Error!");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch 3: Invalid array index!");
		}
		catch (Exception e) {
			System.out.println("Something went wrong...");
		}
		finally {
			input.close();
		}
		System.out.println("The program continues...");
	}

}