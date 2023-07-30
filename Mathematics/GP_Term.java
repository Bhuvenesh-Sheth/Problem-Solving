/*
 * Given the first 2 terms A and B of a Geometric Series. The task is to find the Nth term of the series.

Example 1:

Input:
A = 2 
B = 3
N = 1
Output: 2
Explanation: The first term is already
given in the input as 2
Example 2:

Input:
A = 1
B = 2
N = 5
Output: 16
Explanation: Common ratio = 2,
Hence second term is 1*(2)(5-1) = 24 = 16 .

Your Task:
You don't need to read input or print anything.
Your task is to complete the function termOfGP() that takes A, B and N as parameter and returns Nth term of GP. 
The return value should be double that would be automatically converted to floor by the driver code.
 */

public class GP_Term {
    public double termOfGP(int A, int B, int N) {
        // Your code here
        double r = (double) B / A;
        return A * Math.pow(r, N - 1);

    }
}
