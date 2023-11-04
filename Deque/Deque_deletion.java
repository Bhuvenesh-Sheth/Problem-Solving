import java.util.ArrayDeque;

public class Deque_deletion {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // Your code here
        Iterator it = deq.iterator();

        for (int i = 0; i <= X; i++) {
            it.next();
        }

        it.remove();
    }

    // Function to erase the elements in range start (inclusive), end (exclusive).
    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // Your code here
        Iterator it = deq.iterator();

        for (int i = 0; i < start; i++) {
            it.next();
        }

        for (int i = start; i < end; i++) {
            it.next();
            it.remove();
        }
    }

    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        // Your code here
        Iterator it = deq.iterator();

        for (int i = 0; i <= X; i++) {
            it.next();
        }

        it.remove();
    }

    // Function to erase the elements in range start (inclusive), end (exclusive).
    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        // Your code here
        Iterator it = deq.iterator();

        for (int i = 0; i < start; i++) {
            it.next();
        }

        for (int i = start; i < end; i++) {
            it.next();
            it.remove();
        }
    }
}
