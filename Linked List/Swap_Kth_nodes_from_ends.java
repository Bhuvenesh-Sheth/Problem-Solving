/*
 *Given a singly linked list of size N, and an integer K. You need to swap the Kth node from the beginning and Kth node from the end of the linked list. Swap the nodes through the links. Do not change the content of the nodes.

 

Example 1:

Input:
N = 4,  K = 1
value[] = {1,2,3,4}
Output: 1
Explanation: Here K = 1, hence after
swapping the 1st node from the beginning
and end thenew list will be 4 2 3 1.
 

Example 2:

Input:
N = 5,  K = 7
value[] = {1,2,3,4,5}
Output: 1
Explanation: K > N. Swapping is invalid. 
Return the head node as it is.
 

Your Task: 
You do not need to read input or print anything. The task is to complete the function swapkthnode(), which has takes head of link list, N and K as input parameters and returns the new head.
The generated output will be 1 if you are able to complete your task. 

 

Expected Time Complexity: O(n)
Expected Auxillary space Complexity: O(1)
 */

//User function Template for Java

/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class Swap_Kth_nodes_from_ends {
    // Function to swap Kth node from beginning and end in a linked list.
    Node swapkthnode(Node head, int num, int K) {
        // your code here

        if (K < 1 || K > num) {
            return head;
        }

        Node prevKthFromBegin = null;
        Node currKthFromBegin = head;
        for (int i = 1; i < K; i++) {
            prevKthFromBegin = currKthFromBegin;
            currKthFromBegin = currKthFromBegin.next;
        }

        Node prevKthFromEnd = null;
        Node currKthFromEnd = head;
        for (int i = 1; i < num - K + 1; i++) {
            prevKthFromEnd = currKthFromEnd;
            currKthFromEnd = currKthFromEnd.next;
        }

        if (currKthFromBegin == currKthFromEnd) {
            return head;
        }

        if (prevKthFromBegin != null) {
            prevKthFromBegin.next = currKthFromEnd;
        } else {
            head = currKthFromEnd;
        }

        if (prevKthFromEnd != null) {
            prevKthFromEnd.next = currKthFromBegin;
        } else {
            head = currKthFromBegin;
        }

        Node temp = currKthFromBegin.next;
        currKthFromBegin.next = currKthFromEnd.next;
        currKthFromEnd.next = temp;

        return head;

    }
}
