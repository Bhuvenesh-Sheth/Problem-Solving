/*
 * Given an array arr[] of n numbers. The task is to print only those numbers whose digits are from set {1,2,3}.

Example 1:

Input:
n = 3
arr[] = {4,6,7}
Output: -1
Explanation: No elements are there in the 
array which contains digits 1, 2 or 3.
Example 2:

Input:
n = 4
arr[] = {1,2,3,4}
Output: 1 2 3
Explanation: 1, 2 and 3 are the only 
elements in the array which conatins 
digits as 1, 2 or 3.
Your Task:
Complete findAll function and marked satisfied number as '1' in the map mp in range 1 to 1000000. If no number is marked as satified number -1 will automatically be printed by the drivers code. The driver code prints the elements in sorted order.
 */
public class Numbers_containing_1_2_and_3 {
    public static boolean isValid(int n) {
        while (n != 0) {
            int rem = n % 10;
            if (rem != 1 && rem != 2 && rem != 3) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void findAll() {
        // Your code here
        for (int i = 1; i <= 1000000; ++i) {
            if (isValid(i)) {
                mp.put(i, 1);
            }
        }
    }
}
