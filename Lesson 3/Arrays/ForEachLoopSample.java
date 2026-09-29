class ForEachLoopSample {
    public static void main(String[]args){
        // int idx = 0; 
        int sum = 0;
        int[] numbers = {9, 18, 27, 36, 45};
        /*System.out.println(numbers[idx++]);
        System.out.println(numbers[++idx]);*/

    // for (dataType iteratorVariable : collection)
       for(int number : numbers){
            System.out.println("Number: " +number);
            sum += number;
        }
        System.out.println("Summation: " +sum);
    }
    
}
