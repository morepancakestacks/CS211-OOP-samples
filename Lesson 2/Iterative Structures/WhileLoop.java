import java.util.Scanner;
class WhileLoop {
    public static void main(String[] args) {
        int up_bound = 0, ctr = 1, sum = 0;
        System.out.print("Enter upper bound value: ");
        Scanner value = new Scanner(System.in);
        up_bound = value.nextInt();
    
        while (ctr <= up_bound){
            sum+=ctr;
            ctr++;
        }
        System.out.println("Sum from 1 to " + up_bound + " = " + sum);
        value.close();
    }
}