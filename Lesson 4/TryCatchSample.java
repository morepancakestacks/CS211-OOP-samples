import java.util.Scanner;

class TryCatchSample {
    public static void main(String[]args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a value for dividend: ");
        int dividend = input1.nextInt();
        System.out.print("Enter a value for divisor: ");
        int divisor = input2.nextInt();

        try {
            int quotient = dividend / divisor;
            System.out.println("Quotient of: " + dividend + " and " 
            + divisor + " = " + quotient);
        }
        catch(Exception e){
            System.out.println("Error: Cannot divide by zero.");
        }
       
        input1.close();
        input2.close();

    }
}