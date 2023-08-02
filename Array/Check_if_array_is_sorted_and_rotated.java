/*
 * Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing)
 * and Rotated counter-clockwise. Note that input array may be sorted in either increasing or decreasing order, then rotated.
A sorted array is not considered as sorted and rotated, i.e., there should be at least one rotation.

Example 1:

Input:
N = 4
arr[] = {3,4,1,2}
Output: Yes
Explanation: The array is sorted 
(1, 2, 3, 4) and rotated twice 
(3, 4, 1, 2).
Example 2:

Input:
N = 3
arr[] = {1,2,3}
Output: No
Explanation: The array is sorted 
(1, 2, 3) is not rotated.
 */
public class Check_if_array_is_sorted_and_rotated {
    static boolean inc(int arr[], int num) {
        int i = 0;

        while (i < num - 1 && arr[i] < arr[i + 1])
            i++;

        if (i == num - 1)
            return false;

        i = i + 1;

        while (i < num - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == num - 1 && arr[num - 1] <= arr[0])
            return true;
        else
            return false;
    }

    static boolean dec(int arr[], int num) {
        int i = 0;

        while (i < num - 1 && arr[i] > arr[i + 1])
            i++;

        if (i == num - 1)
            return false;

        i = i + 1;

        while (i < num - 1 && arr[i] > arr[i + 1])
            i++;

        if (i == num - 1 && arr[num - 1] >= arr[0])
            return true;
        else
            return false;
    }

    public static boolean checkRotatedAndSorted(int arr[], int num) {

        // Your code here
        return inc(arr, num) || dec(arr, num);

    }
}
