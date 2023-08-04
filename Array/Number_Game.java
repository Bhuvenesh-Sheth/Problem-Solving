/*
 * Given a number n the task is to find the minimum number which is divisible by all numbers from 1 to n. Print the answer modulo (109+7).
Example 1:

Input:
n = 3
Output:
6 
Explanation:
When n = 3 then the minimum number
that is divisible by all the number
till 3 is 6.
Example 2:

Input:
n = 4
Output:
12
Explanation:
When n = 4 then the minimum number
that is divisible by all the number
till 4 is 12.
 */
public class Number_Game {
    static long GCD(long a, long b){
        if(a==0){
            return b;
        }
        
        return GCD(b%a,a);
    }
    static Long numGame(Long n) {
        // code here
        long ans=1;
        
        for(int i=2;i<=n;i++){
            ans=(ans*i)/GCD(ans,i)%1000000007;
        }
        
        return ans;
    }
}
