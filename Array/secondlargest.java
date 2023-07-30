public class secondlargest {

    // Method to find the index of the largest element in the array
    public static int largest(int arr[]) {
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }
        return largest;
    }

    // Brute Force Approach
    // Method to find the index of the second largest element in the array
    public static int second_largest(int arr[]) {
        int largest = largest(arr); // Call largest() method to get the index of the largest element
        int res = -1; // Initialize result to -1, which is used to track if it's the first number or
                      // not

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[largest]) { // If the current element is not equal to the largest element
                if (res == -1) { // If it's the first element that's not equal to the largest element
                    res = i; // Update result with the index of this element
                } else if (arr[i] > arr[res]) { // If it's not the first element and it's greater than the current
                                                // result
                    res = i; // Update result with the index of this element
                }
            }
        }

        return res; // Return the index of the second largest element
    }

    // Efficient Approach
    // Method to find the index of the second largest element in the array
    public static int secondlargest2(int arr[]) {
        int res = -1;
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) { // If the current element is greater than the largest element
                res = largest; // Update the result with the index of the second largest element
                largest = i; // Update the largest element
            } else if (arr[i] != arr[largest]) { // If the current element is not equal to the largest element
                if (res == -1 || arr[i] > arr[res]) { // If it's the first element that's not equal to the largest
                                                      // element
                                                      // Or if it's greater than the current result
                    res = i; // Update the result with the index of this element
                }
            }
        }

        return res; // Return the index of the second largest element
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 2, 5, 9, 17, 23 };
        int second_index = second_largest(arr); // Call second_largest() method to get the index of the second largest
                                                // element
        int second = arr[second_index];
        System.out.println(second); // Print the second largest element
    }
}
