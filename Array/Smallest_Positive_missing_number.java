/*
 *You are given an array arr[] of N integers. The task is to find the smallest positive number missing from the array.

Note: Positive number starts from 1.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.
Example 2:

Input:
N = 5
arr[] = {0,-10,1,3,-20}
Output: 2
Explanation: Smallest positive missing 
number is 2. 
 */
public class Smallest_Positive_missing_number {
    static int missingNumber(int arr[], int size) {
        for (int i = 0; i < size; i++) {

            int correctIndex = arr[i] - 1;

            while (0 <= correctIndex && correctIndex <= size - 1 && arr[i] != arr[correctIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
                correctIndex = arr[i] - 1;
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }

        return size + 1;
    }
}
