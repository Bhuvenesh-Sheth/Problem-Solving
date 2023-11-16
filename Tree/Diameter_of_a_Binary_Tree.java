
/*
 * The diameter of a tree (sometimes called the width) is the number of nodes on
 * the longest path between two end nodes. The diagram below shows two trees each with
 * diameter nine, the leaves that form the ends of the longest path are shaded
 * (note that there is more than one path in each tree of length nine, but no path longer than nine nodes). 
 */

//{ Driver Code Starts
// Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Diameter_of_a_Binary_Tree {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);
            Solution g = new Solution();
            System.out.println(g.diameter(root));
            t--;
        }
    }
}

// } Driver Code Ends

// User function Template for Java

/*
 * class Node {
 * int data;
 * Node left;
 * Node right;
 * Node(int data) {
 * this.data = data;
 * left = null;
 * right = null;
 * }
 * }
 */
class Solution {
    // Function to return the diameter of a Binary Tree.
    int ans = 0;

    int diameters(Node root) {
        if (root == null)
            return 0;

        int l = diameters(root.left);
        int r = diameters(root.right);

        ans = Math.max(ans, l + r + 1);
        return 1 + Math.max(l, r);
    }

    int diameter(Node root) {
        diameters(root);
        return ans;
    }
}
