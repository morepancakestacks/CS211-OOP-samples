import java.util.Scanner;
class GetFactorial{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int value = input.nextInt();
            int result = factorial(value);
            System.out.println("Factorial of " + value + " is: " + result);
            input.close();
    }

    public static int factorial(int num){
        if (num >= 2){
            return num * factorial(num-1);
        }
        else{
            return 1;
        }
    }
}