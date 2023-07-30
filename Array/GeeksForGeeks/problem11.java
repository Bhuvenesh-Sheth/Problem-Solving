/*
 * n = 5
arr[] = {1,2,3,4,5}
Output: 2 1 4 3 5
Explanation: Array elements after 
sorting it in wave form are 
2 1 4 3 5.
 */

public class problem11 {

    // arr: input array
    // n: size of array
    // Function to sort the array into a wave-like array.
    void convertToWave(int arr[]) {
        for (int i = 0; i < n; i += 2) {
            // If current even element is smaller than previous
            if (i > 0 && arr[i - 1] > arr[i])
                swap(arr[i], arr[i - 1]);

            // If current even element is smaller than next
            if (i < n - 1 && arr[i] < arr[i + 1])
                swap(arr[i], arr[i + 1]);
        }

    }

    public static void main(String[] args) {

    }
}
