/*
 * Given an unsorted array A[] of size N of positive integers. One number 'a' from set {1, 2, N} is missing and one number 'b' occurs twice in array.
 * The task is to find the repeating and the missing.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test
case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
For each testcase, in a new line, print b, which is the repeating number, followed by a, which is the missing number, in a single line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
1 ≤ A[i] ≤ N

Example:
Input:
2
2
2 2
3 
1 3 3

Output:
2 1
3 2

Explanation:
Testcase 1: Repeating number is 2 and smallest positive missing number is 1.
Testcase 2: Repeating number is 3 and smallest positive missing number is 2.
 */

import java.util.Scanner;
import java.util.*;

public class Get_the_Shadow {
    static int a[] = new int[1000001];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (a[Math.abs(a[i]) - 1] > 0)
                    a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
                else
                    System.out.print(Math.abs(a[i]) + " ");
            }

            for (int i = 0; i < n; i++) {
                if (a[i] > 0)
                    System.out.println(i + 1);
            }
        }
    }
}