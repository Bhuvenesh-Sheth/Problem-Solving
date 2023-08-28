import java.util.HashSet;

public class Subarray_with_0_sum {
    static boolean findsum(int arr[], int n) {
        // Your code here
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;

        for (int i = 0; i < arr.length; i++) {
            pre_sum += arr[i];
            if (h.contains(pre_sum))
                return true;
            if (pre_sum == 0 && i > 0)
                return true;
            h.add(pre_sum);
        }

        return false;
    }
}
