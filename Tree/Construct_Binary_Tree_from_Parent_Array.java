
/*
 * Given an array of size N that can be used to represents a tree. 
 * The array indexes are values in tree nodes and array values give the parent node 
 * of that particular index (or node). The value of the root node index would always be -1 
 * as there is no parent for root. Construct the standard linked representation of Binary Tree 
 * from this array representation.

Note: If two elements have the same parent, the one that appears first in the array will be the left child and the other is the right child. 
 */
//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node left, right;

    Node(int key) {
        data = key;
        left = right = null;
    }
}

class Construct_Binary_Tree_from_parent_Array {
    static ArrayList<Integer> result = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Solution ob = new Solution();
            Node root = ob.createTree(arr, n);

            printLevelOrder(root);
            System.out.println();
        }
    }

    public static void printList(Node root) {
        while (root != null) {
            System.out.print(root.data + " ");
        }
    }

    public static void printLevelOrder(Node root) {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            result.clear();
            printGivenLevel(root, i);
            Collections.sort(result);
            for (int j = 0; j < result.size(); j++)
                System.out.print(result.get(j) + " ");
        }
    }

    public static int height(Node root) {
        if (root == null)
            return 0;

        else {

            int lheight = height(root.left);
            int rheight = height(root.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    public static void printGivenLevel(Node node, int level) {
        if (node == null)
            return;
        if (level == 1)
            result.add(node.data);
        else if (level > 1) {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }
}

// } Driver Code Ends

/*
 * node class of the binary tree
 * class Node
 * {
 * int data;
 * Node left, right;
 * Node(int key)
 * {
 * data = key;
 * left = right = null;
 * }
 * }
 */
class Solution {
    // Function to construct binary tree from parent array.
    public static Node createTree(int arr[], int N) {
        // Your code here
        Map<Integer, Node> map = new HashMap<>();
        Node root = null;

        for (int i = 0; i < N; i++) {
            if (arr[i] == -1) {
                root = new Node(i);
                map.put(i, root);
            } else {
                Node temp = new Node(i);
                map.put(i, temp);
            }
        }

        for (int i = 0; i < N; i++) {

            if (arr[i] == -1) {
                continue;
            } else {
                Node temp = map.get(arr[i]);
                if (temp.left == null) {
                    temp.left = map.get(i);
                } else {
                    temp.right = map.get(i);
                }
            }
        }

        return root;
    }

}
