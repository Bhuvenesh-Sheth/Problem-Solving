
import java.util.*;

public class Sort_An_Stack {

    public static void main(String[] args) {
        // Example usage:
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(8);
        stack.push(1);

        sort(stack);

        // Print the sorted stack
        System.out.println(stack);
    }

    static void insert(Stack<Integer> stack, int temp) {
        if (stack.isEmpty() || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insert(stack, temp);
        stack.push(val);
    }

    static void sort(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        sort(stack);
        insert(stack, temp);
    }
}
