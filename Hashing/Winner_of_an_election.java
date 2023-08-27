/*
 * Given an array of names (consisting of lowercase characters) of candidates in an election. A candidate name in array represents a
 * vote casted to the candidate. Print the name of candidate that received Max votes. If there is tie, print lexicographically smaller name.

Example 1:

Input:
n = 13
Votes[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.
Example 2:

Input:
n = 3
Votes[] = {andy,blake,clark}
Output: andy 1
Explanation: All the candidates get 1 
votes each. We print andy as it is 
lexicographically smaller.
Your Task:
You only need to complete the function winner() that takes an array of strings arr, 
and n as parameters and returns the name of the candiate with maximum votes and the number 
of votes the candidate got as an array of size 2
 */

import java.util.HashMap;
import java.util.Map;

public class Winner_of_an_election {
    public static String[] winner(String arr[], int n) {
        // add your code
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String x : arr) {
            if (!map.containsKey(x)) {
                map.put(x, 1);
            } else {
                map.put(x, map.get(x) + 1);
            }
        }

        int res = Integer.MIN_VALUE;
        String str = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if (value > res) {
                res = value;
                str = key;
            } else if (value == res) {
                if (key.compareTo(str) < 0) {
                    str = key;
                }
            }
        }

        String[] a = { str, String.valueOf(res) };

        return a;

    }
}
