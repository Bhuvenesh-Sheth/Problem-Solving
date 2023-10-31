
//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Generate_Binary_Numbers {
    public static void main(String args[]) {
        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking the number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking the range
            int n = sc.nextInt();

            // creating an ArrayList
            ArrayList<String> res = new ArrayList<String>();

            // calling the generate method of class solve
            // and storing the result in an ArrayList
            res = new solve().generate(n);

            // printing all the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends

class solve {

    // Function to generate binary numbers from 1 to N using a queue.
    static ArrayList<String> generate(int N) {
        // Your code here
        ArrayList<String> s = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.offer("1");

        for (int i = 0; i < N; i++) {
            String top = q.poll();
            s.add(top);
            q.offer(top + "0");
            q.offer(top + "1");
        }

        return s;
    }

}
