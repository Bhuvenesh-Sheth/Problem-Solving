/*
 * You are given an array of integers and an integer sum. You need to find if two
 * numbers in the array exists that have sum equal to the given sum.

Example 1:

Input:
N = 10
arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
sum = 14

Output: 
1

Explanation: 
there exists a pair which 
gives sum as 14 example 
(4,10),(5,9) etc.
Example 2:

Input:
N = 4
arr[] ={4, 3, 5, 6}
sum = 12

Output: 
0

Explanation: 
there does not exist any
such pair which gives sum as 12.

Your Task:
You don't need to read input or print anything. You just have to complete the function sumExists() 
which takes the array arr[], its size N and an integer sum as inputs and returns 1 if there exists
a pair with the given sum in the array. Else, it returns 0.*/

import java.util.HashSet;

public class Hashing_for_pair_two {
    public static int sumExists(int arr[], int N, int sum) {

        // Your code here

        HashSet<Integer> a = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            if (a.contains(sum - arr[i]))
                return 1;
            else
                a.add(arr[i]);
        }

        return 0;

    }
}
