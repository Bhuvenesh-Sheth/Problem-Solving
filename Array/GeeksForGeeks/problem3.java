//Mean And Median of Array 

public class problem3 {

    public static void MandM(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Mean: " + sum / arr.length);

        Median(arr);
    }

    public static void Median(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        int middle = 0;

        if (arr.length % 2 == 0) {
            // not this because java is zero indexing language
            // middle=(arr[arr.length/2] +arr[(arr.length/2)+1])/2;
            middle = (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2;
            System.out.println("Median: " + middle);
        } else {
            middle = arr.length / 2;
            System.out.println("Median: " + middle);
        }

    }

    /*
     * Efficient Solution: neglect sort in-build function
     * 
     * public static void calculateMeanAndMedian(int arr[]) {
     * if (arr == null || arr.length == 0) {
     * System.out.println("Error: Empty array");
     * return;
     * }
     * 
     * // Sort the array using Arrays.sort() for better performance
     * Arrays.sort(arr);
     * 
     * int n = arr.length;
     * double mean = 0;
     * double median = 0;
     * 
     * // Calculate mean
     * for (int i = 0; i < n; i++) {
     * mean += arr[i];
     * }
     * mean /= n;
     * 
     * // Calculate median
     * if (n % 2 == 0) {
     * median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
     * } else {
     * median = arr[n / 2];
     * }
     * 
     * System.out.println("Mean: " + mean);
     * System.out.println("Median: " + median);
     * }
     * 
     */

    public static void main(String[] args) {
        int arr[] = { 2, 8, 3, 4, 1, 5, 6, 7 };
        // System.out.println("given array is:" + printarr(arr));
        MandM(arr);
    }

}
