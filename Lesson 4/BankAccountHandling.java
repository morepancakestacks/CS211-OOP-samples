import java.util.Scanner;
class BankAccountHandling {
    // Custom Exception Class
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // Method that throws the custom exception
    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance!"
            );
        }

        balance -= amount;

        System.out.println("Withdrawal successful!");
        System.out.println("Remaining balance: " + String.format("$%,.2f", balance));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 1000000.00;

        try {
            System.out.println("Current balance: " + String.format("$%,.2f", balance));
            System.out.print("Enter amount to withdraw: ");

            double amount = input.nextDouble();

            withdraw(balance, amount);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            // General exception
            System.out.println("Something went wrong: " + e.getMessage());
        }
        finally {
            input.close();
        }
    }
}