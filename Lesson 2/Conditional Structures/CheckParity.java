import java.util.Scanner;

class CheckParity {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int value = input.nextInt();
		
		if (value >= 0) {
			int rem = value % 2;
			if (rem == 0) {
				System.out.print(value + " is an even number.");
			}
			else {
				System.out.print(value + " is an odd number.");
			}
		}
		else {
			System.out.println(value + " is a negative number.");
		}
		input.close();
	}
}