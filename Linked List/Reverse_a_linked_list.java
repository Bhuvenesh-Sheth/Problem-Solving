/*
 * The task is to complete the function reverseList() with head reference as
 * the only argument and should return new head after reversing the list.
 * 
 * Expected Time Complexity: O(N).
   Expected Auxiliary Space: O(1).

    Constraints:
    1 <= N <= 104
 */

//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

}

class Reverse_a_linked_list {
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();

            Node head = new Node(sc.nextInt());
            Node tail = head;

            for (int i = 0; i < n - 1; i++) {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head);
            t--;
        }
    }
}

// } Driver Code Ends

// function Template for Java

/*
 * linked list node class:
 * 
 * class Node {
 * int data;
 * Node next;
 * Node(int value) {
 * this.value = value;
 * }
 * }
 * 
 */

class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            Node newnode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = newnode;
        }
        head.next = null;
        head = prev;

        return head;
    }
}
