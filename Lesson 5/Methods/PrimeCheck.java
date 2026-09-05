import java.util.Scanner;

class PrimeCheck{
    public static void main(String[]args){
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(isprime(num)){
            System.out.print("Prime");
        }
        else {
            System.out.print("Not Prime");
        }
        input.close();
    }

    public static boolean isprime(int val){
        if(val <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(val); i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }
}