public class Functions1DArray {
	public static void main(String[] args) {
		int[] arr = {9, 18, 27, 36, 45};
		int multiplier = 10;

		System.out.print("Original Array: ");
		printArray(arr);

		multiplyToNumber(arr, multiplier);

		System.out.print("\nModified Array: ");
		printArray(arr);
	}

	public static void multiplyToNumber(int[] arr, int multiplier) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= multiplier;
            //multiples the elements
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
        //prints the arrays
	}
}