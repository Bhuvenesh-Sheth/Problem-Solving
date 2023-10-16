/*
 * Input: 
Linked List 1 = 4->1->common
Linked List 2 = 5->6->1->common
common = 8->4->5->NULL
Output: 8
Explanation: 

4              5
|              |
1              6
 \             /
  8   -----  1 
   |
   4
   |
  5
  |
  NULL  
 */
public class Intersection_Point_in_Y_Shaped_Linked_Lists {
    int intersectPoint(Node head1, Node head2) {
        int count1 = 0;
        int count2 = 0;

        Node current1 = head1;
        Node current2 = head2;

        while (current1 != null) {
            count1++;
            current1 = current1.next;
        }

        while (current2 != null) {
            count2++;
            current2 = current2.next;
        }

        int d;
        if (count1 < count2) {
            d = count2 - count1;
            return findIntersection(d, head2, head1);
        } else {
            d = count1 - count2;
            return findIntersection(d, head1, head2);
        }
    }

    int findIntersection(int d, Node head1, Node head2) {
        Node current1 = head1;
        Node current2 = head2;

        for (int i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }

        while (current1 != null && current2 != null) {
            if (current1 == current2) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return -1;
    }
}
