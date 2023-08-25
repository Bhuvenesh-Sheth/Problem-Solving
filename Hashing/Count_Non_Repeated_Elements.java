import java.util.HashMap;

public class Count_Non_Repeated_Elements {
    static long countNonRepeated(int arr[], int n) {
        // add your code
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }

        long count = 0;

        for (int i = 0; i < n; i++) {
            if (m.get(arr[i]) == 1)
                count++;
        }

        return count;

    }
}
