import java.util.ArrayList;
import java.util.HashMap;

public class Print_Non_Repeated_Elements {
    static ArrayList<Integer> printNonRepeated(int arr[], int n) {
        // add your code here
        ArrayList<Integer> print = new ArrayList<Integer>();

        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (m.get(arr[i]) == 1)
                print.add(arr[i]);
        }

        return print;
    }
}
