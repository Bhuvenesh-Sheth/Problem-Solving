/*
 * Given K sorted linked lists of different sizes. The task is to merge them 
 * in such a way that after merging they will be a single sorted linked list.

Example 1:

Input:
K = 4
value = {{1,2,3},{4 5},{5 6},{7,8}}
Output: 1 2 3 4 5 5 6 7 8
Explanation:
The test case has 4 sorted linked 
list of size 3, 2, 2, 2
1st    list     1 -> 2-> 3
2nd   list      4->5
3rd    list      5->6
4th    list      7->8
The merged list will be
1->2->3->4->5->5->6->7->8.
Example 2:

Input:
K = 3
value = {{1,3},{4,5,6},{8}}
Output: 1 3 4 5 6 8
Explanation:
The test case has 3 sorted linked
list of size 2, 3, 1.
1st list 1 -> 3
2nd list 4 -> 5 -> 6
3rd list 8
The merged list will be
1->3->4->5->6->8.
Your Task:
The task is to complete the function mergeKList() which merges the K given 
lists into a sorted one. The printing is done automatically by the driver code.

Expected Time Complexity: O(nk Logk)
Expected Auxiliary Space: O(k)
Note: n is the maximum size of all the k link list

Constraints
1 <= K <= 103
 */

//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Node[] a = new Node[N];

            for (int i = 0; i < N; i++) {
                int n = sc.nextInt();

                Node head = new Node(sc.nextInt());
                Node tail = head;

                for (int j = 0; j < n - 1; j++) {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }

                a[i] = head;
            }

            Solution g = new Solution();

            Node res = g.mergeKList(a, N);
            if (res != null)
                printList(res);
            System.out.println();
        }
    }
}
// } Driver Code Ends

/*
 * class Node
 * {
 * int data;
 * Node next;
 * 
 * Node(int key)
 * {
 * data = key;
 * next = null;
 * }
 * }
 */

// a is an array of Nodes of the heads of linked lists
// and N is size of array a

class Merge_K_sorted_linked_lists {
    // Function to merge K sorted linked list.
    static Node merge(Node head, Node curr) {
        Node a = head, b = curr;
        Node tail = null, head1 = null;
        if (a.data > b.data) {
            tail = b;
            b = b.next;
            head1 = tail;
        } else {
            tail = a;
            a = a.next;
            head1 = tail;
        }
        while (a != null && b != null) {
            if (a.data < b.data) {
                Node temp = a.next;
                tail.next = a;
                tail = tail.next;
                a = temp;
            } else {
                Node temp2 = b.next;
                tail.next = b;
                tail = tail.next;
                b = temp2;
            }
        }
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        return head1;
    }

    Node mergeKList(Node[] arr, int K) {
        // Add your code here.
        if (K == 0) {
            return null;
        } else if (K == 1) {
            return arr[0];
        }
        Node head = merge(arr[0], arr[1]);
        for (int i = 2; i < K; i++) {
            Node curr = arr[i];
            head = merge(head, curr);
        }

        return head;
    }
}
