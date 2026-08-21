class BreakAndContinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // Skip 5
            }

            if (i == 8) {
                break; // Stop the loop at 8
            }

            System.out.print(i + " ");
        }
    }
}