//Who has the majority?
/*
 * Example 1:
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
public class problem4 {

    public static int majorityWins(int arr[], int x, int y) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                a++;
            } else if (y == arr[i]) {
                b++;
            }

            if (a > b) {
                System.out.println(x);
                return x;
            } else if (a < b) {
                System.out.println(y);
                return y;
            } else {
                System.out.println(Math.min(x, y));
                return Math.min(x, y);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        majorityWins(arr, 1, 7);
    }
}
