/*Given a positive integer value N. The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3.

Example 1:

Input:
N = 6
Output: 1
Explanation: The only number less than 6 with 
3 divisors is 4.
Example 2:

Input:
N = 10
Output: 2
Explanation: 4 and 9 have 3 divisors.*/

public class Exactly_Three_Divisors {
    public boolean prime(int N) {
        if (N == 1)
            return false;
        if (N == 2 || N == 3)
            return true;
        if (N % 2 == 0 || N % 3 == 0)
            return false;

        for (int i = 5; i * i <= N; i = i + 6) {
            if (N % i == 0 || N % (i + 2) == 0)
                return false;
        }

        return true;
    }

    public int exactly3Divisors(int N) {
        // Your code here
        int count = 0;
        for (int i = 2; i * i <= N; i++) {
            if (prime(i))
                count++;
        }
        return count;
    }
}
