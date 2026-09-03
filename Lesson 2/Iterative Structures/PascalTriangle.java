import java.util.Scanner;

class PascalTriangle {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {

            int number = 1;

            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                //System.out.print(number + " ");

                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }

        input.close();
    }
}