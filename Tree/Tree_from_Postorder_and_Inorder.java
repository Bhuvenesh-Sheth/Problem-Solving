
//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int value) {
        data = value;
        left = null;
        right = null;
    }
}

class Tree_from_Postorder_and_Inorder {
    public void preOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);

        preOrder(root.right);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        InorderPostorderToTree ip = new InorderPostorderToTree();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int inorder[] = new int[n];
            int postorder[] = new int[n];
            for (int i = 0; i < n; i++)
                inorder[i] = sc.nextInt();
            for (int i = 0; i < n; i++)
                postorder[i] = sc.nextInt();
            GfG g = new GfG();
            Node root = g.buildTree(inorder, postorder, n);
            ip.preOrder(root);
            System.out.println();

            T--;
        }
    }
}

// } Driver Code Ends

/*
 * Tree node structure
 * class Node
 * {
 * int data;
 * Node left;
 * Node right;
 * 
 * Node(int value)
 * {
 * data = value;
 * left = null;
 * right = null;
 * }
 * }
 */

class GfG {
    // Function to return a tree created from postorder and inoreder traversals.

    static int postIndex;
    static HashMap<Integer, Integer> map;

    public static Node wrap(int in[], int post[], int n) {

        postIndex = n - 1;
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(in[i], i);
        }

        return newtree(in, post, 0, n - 1);
    }

    public static Node newtree(int in[], int post[], int is, int ie) {

        if (is > ie) {
            return null;
        }

        Node root = new Node(post[postIndex--]);

        int inIndex = map.get(root.data);

        root.right = newtree(in, post, inIndex + 1, ie);
        root.left = newtree(in, post, is, inIndex - 1);

        return root;

    }

    Node buildTree(int in[], int post[], int n) {
        // Your code here

        return wrap(in, post, n);
    }
}
