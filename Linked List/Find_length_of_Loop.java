/*
 * Given a linked list of size N. The task is to complete the function countNodesinLoop() that checks whether a given Linked List contains a loop or not and 
 * if the loop is present then return the count of nodes in a loop or else return 0. C is the position of the node to which the last node is connected. 
 * If it is 0 then no loop.
 */

//{ Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class Find_length_of_Loop {
    public static void makeLoop(Node head, Node tail, int x) {
        if (x == 0)
            return;

        Node curr = head;
        for (int i = 1; i < x; i++)
            curr = curr.next;

        tail.next = curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;

            for (int i = 0; i < n - 1; i++) {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }

            int pos = sc.nextInt();
            makeLoop(head, tail, pos);

            Solution x = new Solution();
            System.out.println(x.countNodesinLoop(head));
        }
    }
}

// } Driver Code Ends

/*
 * 
 * class Node
 * {
 * int data;
 * Node next;
 * Node(int d) {data = d; next = null; }
 * }
 * 
 */

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;
        boolean loopDetected = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loopDetected = true;
                break;
            }
        }

        if (!loopDetected)
            return 0;

        int res = 1;
        fast = fast.next;
        while (fast != slow) {
            res++;
            fast = fast.next;

        }
        return res;

    }
}
