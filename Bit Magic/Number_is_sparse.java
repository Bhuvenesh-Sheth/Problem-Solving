
public class Number_is_sparse {
    public static boolean isSparse(int n) {
        // Your code here

        for (int i = 0; i < 33; i++) {
            if (((n & 1) == 1) && (((n >> 1) & 1) == 1))
                return false;

            n = n >> 1;
        }

        return true;
    }
}