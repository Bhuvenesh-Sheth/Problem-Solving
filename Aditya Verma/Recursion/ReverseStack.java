import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        reverse(stack);

        // Print the reversed stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    static void reverse(Stack<Integer> s) {
        if (s.size() == 1) {
            return;
        }
        int temp = s.pop();
        reverse(s);
        insert(s, temp);
    }

    static void insert(Stack<Integer> s, int temp) {
        if (s.isEmpty()) {
            s.push(temp);
            return;
        }
        int val = s.pop();
        insert(s, temp);
        s.push(val);
    }
}
