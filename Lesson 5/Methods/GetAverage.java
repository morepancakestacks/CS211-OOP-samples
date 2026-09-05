import java.util.Scanner;

class GetAverage {

    public static float average(int sum, int count) {
        if (count == 0) {
            return 0.0f;
        }
        return (float) sum / count;
    }

    public static void main(String[] args) {
        System.out.println("Enter numbers (0 to stop):");
        int sum = 0, count = 0;
        int n;
        
        Scanner num = new Scanner(System.in);
        
        while ((n = num.nextInt()) != 0) {
            sum += n;
            count++;
        }

        float average = average(sum, count);
        System.out.printf("Average: %.2f%n", average);

        num.close();
    }
}
