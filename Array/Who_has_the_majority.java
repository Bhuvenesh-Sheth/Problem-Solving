/*
 * Given an array arr[] of size N and two elements x and y, use counter variables to find which element appears most in the array. If both elements have the same frequency, then return the smaller element.
Note:  We need to return the element, not its count.

Example 1:

Input:
N = 11
arr[] = {1,1,2,2,3,3,4,4,4,4,5}
x = 4, y = 5
Output: 4
Explanation: 
frequency of 4 is 4.
frequency of 5 is 1.
 

Example 2:

Input:
N = 8
arr[] = {1,2,3,4,5,6,7,8}
x = 1, y = 7
Output: 1
Explanation: 
frequency of 1 is 1.
frequency of 7 is 1.
Since 1 < 7, return 1.
 */
public class Who_has_the_majority {
    public int majorityWins(int arr[], int n, int x, int y) {
        // code here
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                count1++;

            if (arr[i] == y)
                count2++;
        }

        if (count1 == count2 && y > x || (count1 > count2))
            return x;

        if (count1 == count2 && x > y || (count2 > count1))
            return y;

        return 0;
    }
}
