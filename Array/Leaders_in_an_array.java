/*
 * Given an array A of positive integers. Your task is to find the leaders in the array. 
 *An element of array is leader if it is greater than or equal to all the elements to its right side.
 The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included.
Example 2:

Input:
n = 5
A[] = {1,2,3,4,0}
Output: 4 0
Explanation: 0 is the rightmost element
and 4 is the only element which is greater
than all the elements to its right.
 */

import java.util.ArrayList;

public class Leaders_in_an_array {
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int curr = arr[n - 1];
        temp.add(curr);

        for (int i = n - 2; i >= 0; i--) {
            if (curr <= arr[i]) {
                curr = arr[i];
                temp.add(curr);
            }
        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = temp.size() - 1; i >= 0; i--) {
            res.add(temp.get(i));
        }

        return res;
    }
}
