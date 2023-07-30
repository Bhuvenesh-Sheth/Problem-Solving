public class problem5 {

    public static void largestAndSecondLargest(int arr[]) {
        int largest = 0;
        int Slargest = 0;

        for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
            if (arr[i] > arr[j]) {
                largest = arr[i];
                Slargest = arr[j];
            } else if (arr[i] < arr[j]) {
                largest = arr[j];
                Slargest = arr[i];
            } else if (arr[j] > Slargest && arr[j] < largest) {
                Slargest = arr[j];
            }
        }

        System.out.println(largest);
        System.out.println(Slargest);

    }

    /*
     * Efficient Solution
     * public static void largestAndSecondLargest(int arr[]) {
     * int largest = Integer.MIN_VALUE; // Initialize largest to smallest possible
     * integer value
     * int secondLargest = Integer.MIN_VALUE; // Initialize second largest to
     * smallest possible integer value
     * 
     * for (int i = 0; i < arr.length; i++) {
     * if (arr[i] > largest) {
     * secondLargest = largest; // Move current largest to second largest
     * largest = arr[i]; // Update largest with new value
     * } else if (arr[i] > secondLargest && arr[i] < largest) {
     * secondLargest = arr[i]; // Update second largest with new value
     * }
     * }
     * 
     * System.out.println("Largest: " + largest);
     * System.out.println("Second Largest: " + secondLargest);
     * }
     * 
     */
    public static void main(String[] args) {
        int arr[] = { 2, 1, 2 };
        largestAndSecondLargest(arr);
    }
}
