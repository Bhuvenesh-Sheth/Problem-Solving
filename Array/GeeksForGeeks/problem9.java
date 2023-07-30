public class problem9 {

    public static int minAdjDiff(int arr[]) {
        int minsum = arr[0] - arr[arr.length - 1];
        int currsum;

        for (int i = 0, j = 1; i < arr.length && j < arr.length; i++, j++) {
            currsum = arr[i] - arr[j];
            if (currsum < 0) {
                currsum = currsum * -1;
            }

            if (minsum < 0) {
                minsum = minsum * -1;
            }

            minsum = Math.min(minsum, currsum);
            // System.out.print(currsum+" ");
        }

        return minsum;
    }

    // efficient solution
    public static int minAdjDiff1(int arr[]) {
        int n = arr.length;
        int minDiff = Math.abs(arr[0] - arr[n - 1]);

        for (int i = 0; i < n - 1; i++) {
            int currDiff = Math.abs(arr[i + 1] - arr[i]);
            minDiff = Math.min(minDiff, currDiff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int arr[] = { 8, -8, 9, -9, 10, -11, 12 };
        // minAdjDiff(arr);
        int k = minAdjDiff(arr);
        System.out.println(k);
    }
}
