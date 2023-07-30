//Array insert at end 
// My First Pull Request.
// My First Push Request

public class problem1 {
    public static void insert(int arr[], int d) {
        int newarr[] = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }

        newarr[arr.length] = d;

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        insert(arr, 90);
    }

}
