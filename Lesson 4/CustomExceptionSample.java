import java.util.Scanner;
class CustomExceptionSample {
    // Custom Exception Class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    // class is static - the custom exception was placed inside the main class

    // Method that throws the custom exception
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "Age must be 18 or older to vote."
            );
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter applicant's age: ");
            int age = input.nextInt();
            checkAge(age);
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        finally {
            input.close();
        }
    }
}