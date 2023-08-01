/*
 * You are given a number N. You need to find the perfect square that is nearest to it.
 *  If two perfect squares are at the same distance to N, then print the greater perfect square.

Note: In the output, you have to print a number that must not equal the given number in input.
If any number is already a perfect square number, print the perfect square number nearest to it. (check testcase #3)

Input:
The first line of input contains T denoting the number of testcases. T testcases follow. 
Each testcase contains one line of input containing N. (Note that, the input N may not fit in "int" datatype - check constraints)

Output:
For each testcase, in a new line, print the perfect square closest to N. 

Constraints:
1 <= T <= 100
1 <= N <= 1014

Examples:
Input:
4
1
56
100
3
Output:
0
49
81
4

Explanation:
Testcase1: 0 and 4 are near to 1. 0 is nearest.
Testcase2: 49 and 64 are near to 56. 49 is nearest.
Testcase3: 81 and 121 are near to 100. 81 is nearest.
Testcase4: 1 and 4 are near to 3. 4 is nearest.
 */

import java.util.Scanner;

public class Nearest_Perfect_Square {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            long n = sc.nextLong();

            long smaller;
            long greater;

            if (Geeks.isPerfectSquare(n) == true) {
                smaller = (long) Math.sqrt(n) - 1;
                greater = (long) Math.sqrt(n) + 1;
            } else {
                smaller = (long) Math.floor(Math.sqrt(n));
                greater = (long) Math.ceil(Math.sqrt(n));
            }

            if ((long) Math.abs(smaller * smaller - n) < (long) Math.abs(greater * greater - n))
                System.out.println(smaller * smaller);
            else
                System.out.println(greater * greater);
        }
    }

}

class Geeks {
    public static boolean isPerfectSquare(long number) {
        long root = (long) Math.sqrt(number);
        return root * root == number;
    }
}