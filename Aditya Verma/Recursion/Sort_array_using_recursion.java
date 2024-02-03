import java.util.*;

public class Sort_array_using_recursion {

    public static void main(String[] args) {
        // Example usage:
        Vector<Integer> arr = new Vector<>();
        arr.add(5);
        arr.add(2);
        arr.add(8);
        arr.add(1);

        sort(arr);

        // Print the sorted array
        System.out.println(arr);
    }

    static void sort(Vector<Integer> arr) {
        if (arr.size() == 1) {
            return;
        }

        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        sort(arr);
        insert(arr, temp);
    }

    static void insert(Vector<Integer> arr, int temp) {
        if (arr.isEmpty() || arr.get(arr.size() - 1) <= temp) {
            arr.add(temp);
            return;
        }

        int val = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        insert(arr, temp);
        arr.add(val);
    }
}
