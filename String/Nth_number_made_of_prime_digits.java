/*
 * Given a number 'N'. The task is to find the Nth number whose each digit is a prime number i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.

Example 1:

Input:
N = 10
Output: 33
Explanation:10th number in the sequence of
numbers whose each digit is prime is 33.
Example 2:

Input:
N = 21
Output: 222
Explanation:21st number in the sequence of
numbers whose each digit is prime is 222.
Your Task:
Complete primeDigits function and return the nth number of the given sequence made of prime digits.

Constraints:
1 <= N <= 100 
 */
public class Nth_number_made_of_prime_digits {
    public static int primeDigits(int n) {
        // Your code here
        int counter = 0;
        int i = 0;

        while (counter != n) {
            String str_value = String.valueOf(i);
            boolean isPrimeNumber = true;

            for (char digit : str_value.toCharArray()) {
                if (digit != '2' && digit != '3' && digit != '5' && digit != '7') {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                counter++;
            }

            i++;
        }

        return i - 1;
    }
}
