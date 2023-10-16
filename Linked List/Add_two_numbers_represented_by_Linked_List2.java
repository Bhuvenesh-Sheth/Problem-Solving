/*
 *Given two numbers represented by two linked lists, 
 write a function that returns Sum list. The sum list is linked list 
 representation of addition of two input numbers.

Example 1:

Input:
S1 = 3, S2 = 3
ValueS1 = {2,3,4}
ValueS2 = {3,4,5}
Output: 5 7 9
Explanation: After adding the 2 numbers
the resultant number is 5 7 9.
Example 2:

Input:
S1 = 1, S2 = 2
ValueS1 = {9}
ValueS2 = {8,7}
Output: 9 6
Explanation: Add 9 and 7 we get 16.
1 is carry here and is added to 8.
So the answer is 9 6
Your Task:
The task is to complete the function addSameSize() addCarryToRemaining().

Constraints:
1 <= S1, S2 <= 100
 */

import java.util.LinkedList;

public class Add_two_numbers_represented_by_Linked_List2 {
    Node cur; // Dont change the variable name, its used in main function
    int carry; // Dont change the variable name, its used in main function

    // This function is called after the smaller list is added to the sublist of
    // bigger list of same size. Once the right sublist is added, the carry
    // must be added to left side of larger list to get the final result.
    void addCarryToRemaining(Node head, LinkedList res) {
        // Write code here
        if (head != cur) {
            addCarryToRemaining(head.next, res);

            int d = head.data + carry;
            res.push(d % 10);
            carry = d / 10;
        }
    }

    void addSameSize(Node head1, Node head2, LinkedList res) {
        // Write code here
        if (head1 == null) {
            return;
        }

        addSameSize(head1.next, head2.next, res);

        int d = head1.data + head2.data + carry;
        carry = d / 10;
        res.push(d % 10);
    }
}
