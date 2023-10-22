
/*
 *Given a stack of integers and Q queries. The task is to perform the operation on stack according to the query.

The queries can be of 4 types:
i x: (adds element x in the stack).
r: (removes the topmost element from the stack).
h: Prints the topmost element.
f y: (check if the element y is present or not in the stack). Print "Yes" if present, else "No".
 
Example 1:
Input: 
Q = 6 
Queries = {(i, 2), (i, 4), (i, 3),
(i, 5), (h), (f, 8)}
Output: 
5
No
Explanation: 
Inserting 2, 4, 3, and 5 
onto the stack. Returning top element 
which is 5. Finding 8 will give No, 
as 8 is not in the stack.
 
Example 2:
Input: 
Q = 4
Queries = {(i, 3), (i, 4), (r), (f, 3)}
Output: 
Yes
Explanation: 
Inserting 3 and 4 onto the 
stack. Finding 3 will give Yes as output 
because 3 is available in the stack.
 

Your Task:
Your task is to complete functions insert(), remove(), headOf_Stack() which 
takes a stack as input parameter, and find() which takes a stack and value as input parameter, 
to insert, remove returning top element, and finding the element in stack respectively. 
 */
//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Operations_on_Stack {
    // Function to push an element into the stack.
    public static void insert(Stack<Integer> st, int x) {
        // Your code here
        st.push(x);

    }

    // Function to remove top element from stack.
    public static void remove(Stack<Integer> st) {
        // Your code here
        st.pop();
    }

    // Function to print the top element of stack.
    public static void headOf_Stack(Stack<Integer> st) {
        // Your code here
        System.out.println(st.peek());
    }

    // Function to search an element in the stack.
    public static boolean find(Stack<Integer> st, int val) {
        // Your code here
        if (st.search(val) >= 0) {
            return true;
        } else {
            return false;
        }
    }
}

// { Driver Code Starts.

// Driver class with Driver code
class GFG {
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            // Declaring stack of integers
            Stack<Integer> st = new Stack<Integer>();

            int q = sc.nextInt();

            // Working with queries
            while (q-- > 0) {

                char ch = sc.next().charAt(0);

                // Creating an object of class Geeks
                Geeks obj = new Geeks();
                if (ch == 'i') {
                    int x = sc.nextInt();

                    // calling insert method of class geeks
                    obj.insert(st, x);
                }

                if (ch == 'r') {
                    // calling remove method of class geeks
                    obj.remove(st);
                }

                if (ch == 'h') {
                    // calling headOf_Stack method of class geeks
                    obj.headOf_Stack(st);
                }
                if (ch == 'f') {
                    int x = sc.nextInt();

                    // Printing Yes if the value x
                    // is in the Stack else No
                    if (obj.find(st, x))
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }
        }
    }
}
// } Driver Code Ends
