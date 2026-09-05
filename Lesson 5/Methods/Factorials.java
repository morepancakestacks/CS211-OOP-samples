import java.util.Scanner;
public class Factorials {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int f = factorial(num);
        System.out.print("The factorial of the given number is "+ f);
        in.close();
    }

   public static int factorial (int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}