import java.util.Scanner;

class ExceptionHandling {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            int result = 100 / 10;
            System.out.println("100 / " + number + " = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        catch (Exception e){
             System.out.println("Error: Invalid input. Please enter a valid number.");
        }

        finally {
            System.out.println("Program has ended.");
        }

        input.close();

    }
}
