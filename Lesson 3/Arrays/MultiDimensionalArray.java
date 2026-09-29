class MultiDimensionalArray{
    public static void main(String[]args){
        int[][] values = {
            {7, 14, 21}, // row 0
            {28, 35}, // row 1
        };

        System.out.println("Rows = " + values.length);
        System.out.println("Columns = " + values[0].length);

        System.out.println("Array Elements:");
        
        for (int row = 0; row < values.length; row++) {
            System.out.print("Row " + row + ": ");
            for(int idx = 0; idx < values[row].length; idx++) {
                System.out.printf("%4d", values[row][idx]);
            }
            System.out.println();
        }
    }
}