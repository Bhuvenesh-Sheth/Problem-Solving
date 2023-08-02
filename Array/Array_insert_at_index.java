public class Array_insert_at_index {
    public void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
        // Your code here, Geeks
        for (int i = sizeOfArray - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = element;
    }
}
