
//{ Driver Code Starts
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

class Maximum_difference_between_node_and_its_ancestor {

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
        while (t-- > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Tree tr = new Tree();
            System.out.println(tr.maxDiff(root));

        }

    }
}

// } Driver Code Ends

// User function Template for Java

// Back-end complete function Template for Java

/*
 * class Node
 * {
 * int data;
 * Node left, right;
 * 
 * Node(int item)
 * {
 * data = item;
 * left = right = null;
 * }
 * }
 */

class Tree {
    // Function to return the maximum difference between any
    // node and its ancestor
    int ans;

    int find(Node root) {

        if (root == null) {
            return Integer.MAX_VALUE;
        }

        int left = find(root.left);
        int right = find(root.right);
        ans = Math.max(ans, Math.max(root.data - left, root.data - right));
        return Math.min(left, Math.min(root.data, right));

    }

    int maxDiff(Node root) {
        // your code here
        ans = Integer.MIN_VALUE;
        find(root);
        return ans;
    }

}
