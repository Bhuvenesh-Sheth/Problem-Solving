/*
 * Strongest Neighbour 
 * Example 1:

Input:
n = 6
arr[] = {1,2,2,3,4,5}
Output: 2 2 3 4 5
Explanation: Maximum of arr[0] and arr[1]
is 2, that of arr[1] and arr[2] is 2, ...
and so on. For last two elements, maximum 
is 5.
Example 2:

Input:
n = 2
arr[] = {5, 5}
Output: 5
Explanation: We only have two elements 
so max of 5 and 5 is 5 only.
 */

public class problem6 {

    public static void maximumAdjacent(int arr[]) {
        for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
            if (arr[i] < arr[j] || arr[i] == arr[j]) {
                System.out.print(arr[j] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /*efficient solution
     * public static void maximumAdjacent(int arr[]) {
     * for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
     * int max = Math.max(arr[i], arr[j]); // Find the maximum value between arr[i]
     * and arr[j]
     * System.out.print(max + " ");
     * }
     * }
     */

    public static void main(String[] args) {
        int arr[] = { 5, 5 };
        maximumAdjacent(arr);
    }
}
