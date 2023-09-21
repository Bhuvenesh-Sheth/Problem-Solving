/*
 *Create a link list of size N according to the given input literals. Each integer input is accompanied
 by an indicator which can either be 0 or 1. If it is 0, insert the integer in the beginning of the link list.
 If it is 1, insert the integer at the end of the link list. 
Hint: When inserting at the end, make sure that you handle NULL explicitly.
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

class Linked_List_Insertion {
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
            Node head = null;
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                Solution ob = new Solution();
                if (indicator == 0)
                    head = ob.insertAtBeginning(head, value);
                else
                    head = ob.insertAtEnd(head, value);
            }
            printList(head);
            t--;
        }
    }
}

// } Driver Code Ends

/*
 * class Node{
 * int data;
 * Node next;
 * 
 * Node(int x){
 * data = x;
 * next = null;
 * }
 * }
 */
class Solution {
    // Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x) {
        // code here
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
        return head;

    }

    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node temp = new Node(x);
        if (head == null) {
            return temp;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
}
