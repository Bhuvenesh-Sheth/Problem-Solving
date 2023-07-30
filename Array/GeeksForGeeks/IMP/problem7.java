/*7. Reverse array in groups
Example 1:
Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.
 

Example 2:
Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9
 */
import java.util.StringJoiner;
public class problem7 {

    public static void reverseInGroups(int arr[], int k) {
        int n = arr.length;
    
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    
        // Print the reversed array within the reverseInGroups() method
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int k = 3;
        reverseInGroups(arr, k);
    }
}
