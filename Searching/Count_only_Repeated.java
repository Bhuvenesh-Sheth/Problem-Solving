/*
 * Given an array arr[] of N positive integers, where elements are consecutive (sorted). Also, there is a single element which is repeating X (any variable) number of times. Now, the task is to find the element which is repeated and number of times it is repeated.
Note: If there's no repeating element, Return {-1,-1}.


Example 1:

Input:
N = 5
arr[] = {1,2,3,3,4}
Output: 3 2
Explanation: In the given array, 3 is 
occuring two times.
Example 2:

Input:
N = 5
arr[] = {2,3,4,5,5}
Output: 5 2
Explanation: In the given array, 5 is 
occuring two times.
Example 3:

Input:
N = 3
arr[] = {1,2,3}
Output: -1 -1
Explanation: In the given array, there's no
repeating element, and thus the given Output.
 */
public class Count_only_Repeated {
    static class Pair {
        long x;
        long y;

        Pair(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public static Pair findRepeating(Long arr[], int n) {
            long[] convertedArr = new long[n];
            for (int i = 0; i < n; i++) {
                convertedArr[i] = arr[i];
            }

            int repeating = 0;
            int count = 1;
            for (int i = 0; i < n - 1; i++) {
                int temp = (int) Math.abs(convertedArr[i]) - 1;
                if (convertedArr[temp] < 0) {
                    repeating = Math.abs(temp + 1);
                    break;
                }
                convertedArr[temp] = -convertedArr[temp];
            }

            for (int i = 0; i < n; i++) {
                if (convertedArr[i] == repeating) {
                    count++;
                }
            }

            if (repeating == 0) {
                repeating = -1;
                count = -1;
                return new Pair(repeating, count);
            }

            return new Pair(repeating, count);
        }
    }
}
