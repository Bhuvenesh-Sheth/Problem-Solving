public class sorted {

    // Method to print array elements
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // brute force
    // Method to remove duplicates using an additional array
    public static int remdup(int arr[]) {
        // Create a temporary array to store unique elements
        int temp[] = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;

        // Traverse the input array, and add elements to the temp array if they are not
        // duplicates
        for (int i = 1; i < arr.length; i++) {
            if (temp[res - 1] != arr[i]) {
                temp[res] = arr[i];
                res++;
            }
        }

        // Copy the unique elements from the temp array back to the input array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        // Return the number of unique elements
        return res;
    }

    // efficient approach
    // Method to remove duplicates without using an additional array
    public static int remdup2(int arr[]) {
        // Initialize a pointer to keep track of the last unique element
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            // If the current element is not a duplicate, add it to the input array and
            // increment the pointer
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }

        // Return the number of unique elements
        return res;
    }

    public static void main(String[] args) {
        // Initialize the input array
        int arr[] = { 10, 20, 30, 30, 30, 40, 40, 50 };

        // Call the remdup2 method to remove duplicates
        int res = remdup2(arr);

        // Print the resulting array
        System.out.print("The resulting array is: ");
        for (int i = 0; i < res; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
