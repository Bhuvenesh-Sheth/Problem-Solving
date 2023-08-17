//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n) {
    int[] memo = new int[n + 1];
    Arrays.fill(memo, -1);
    return fibonacci(n, memo);
}

static int fibonacci(int n, int[] memo) {
    if (memo[n] != -1)
        return memo[n];
    
    if (n == 0 || n == 1)
        return memo[n] = n;

    return memo[n] = (fibonacci(n - 1, memo) + fibonacci(n - 2, memo)) % 1000000007;
}
}