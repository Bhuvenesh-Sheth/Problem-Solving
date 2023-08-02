/*
 *Given an array a[ ] of size N. The task is to find the median and mean of the array elements. Mean is average of
 the numbers and median is the element which is smaller than half of the elements and greater than remaining half. 
 If there are odd elements, the median is simply the middle element in the sorted array. If there are even elements,
 then the median is floor of average of two middle numbers in the sorted array. If mean is floating point number, then we need to print floor of it.

Note: To find the median, you might need to sort the array. Since sorting is covered in later tracks, we have already provided the sort function to you in the code.

Example 1:

Input:
N = 5
a[] = {1, 2, 19, 28, 5}
Output: 11 5
Explanation: For array of 5 elements,
mean is (1 + 2 + 19  + 28  + 5)/5 = 11.
Median is 5 (middle element after 
sorting)
Example 2:

Input:
N = 4
a[] = {2, 8, 3, 4}
Output: 4 3
Explanation: For array of 4 elements,
mean is floor((2 + 8 + 3 + 4)/4) = 4.
Median is floor((4 + 3)/2) = 3 
 */

import java.util.Arrays;

public class Mean_And_Median_of_Array {
    public int median(int A[], int N) {

        Arrays.sort(A);
        int median = (N / 2);
        int ans = 0;
        if (N % 2 != 0) {
            return A[median];
        } else {
            ans = (A[median] + A[median - 1]);
            return ans / 2;
        }

        // Your code here
        // If median is fraction then conver it to integer and return
    }

    // Function to find median of the array elements.
    public int mean(int A[], int N) {
        // Your code here
        int mean = 0;
        for (int i = 0; i < N; i++) {
            mean += A[i];
        }
        return mean / N;
    }
}
