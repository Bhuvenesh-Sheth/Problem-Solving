import java.util.*;

public class Delete_Middle_Element_in_Stack {

    static void solve(Stack<Integer> st, int k) {
        if (st.size() == 1) {
            st.pop(); // base condition
            return;
        }
        int temp = st.pop();
        solve(st, k - 1);
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int k = (st.size() / 2 + 1);

        solve(st, k);

        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}
