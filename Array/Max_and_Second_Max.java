import java.util.ArrayList;

public class Max_and_Second_Max {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[]) {
        // code here.
        ArrayList<Integer> sec = new ArrayList<Integer>();
        int first, second;
        first = second = Integer.MIN_VALUE;
        int res = -1;
        for (int i = 0; i < sizeOfArray; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];

            }

            else if (arr[i] > second && arr[i] != first) {
                res = 1;
                second = arr[i];
            }

        }

        if (res == -1) {
            sec.add(first);
            sec.add(-1);
            return sec;
        }
        sec.add(first);
        sec.add(second);

        return sec;
    }
}
