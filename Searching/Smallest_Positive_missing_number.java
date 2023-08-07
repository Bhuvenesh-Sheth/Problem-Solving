public class Smallest_Positive_missing_number {
    static int missingNumber(int arr[], int size) {
        // Your code here
        for (int i = 0; i < size; i++) {

            int correctIndex = arr[i] - 1;

            while (0 <= correctIndex && correctIndex <= size - 1 && arr[i] != arr[correctIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
                correctIndex = arr[i] - 1;
            }
        }

        for (int i = 0; i < size; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }

        return size + 1;
    }
}
