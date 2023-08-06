/*
 *Given a sorted array of positive integers (elements may be repeated) and a number x. The task is to find the leftmost index of x in the given array.

Example 1:

Input:
N = 10
arr[] = {1,1,2,2,3,4,5,5,6,7}
x = 1
Output: 0
Explanation: 1 is present two times
in the array and its leftmost index 
is 0.
Example 2:

Input:
N = 7
arr[] = {10,20,20,20,20,20,20}
x = 20
Output: 1
Explanation: 20 is present 5 time, 
but its leftmost index is 1.
 */
public class Left_Index {
    static int leftIndex(int N, int arr[], int X) {

        // Your code here
        int low = 0;
        int high = N - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (X < arr[mid]) {
                high = mid - 1;
            } else if (X > arr[mid]) {
                low = mid + 1;
            } else {
                if (mid == 0 || (arr[mid] != arr[mid - 1]))
                    return mid;
                else
                    high = mid - 1;
            }
        }

        return -1;

    }
}
