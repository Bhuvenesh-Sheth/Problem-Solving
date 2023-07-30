public class subarray {

    public static void subarray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) 
        {
            for (int j = i; j <= arr.length - 1; j++)
            {
                for (int k = i; k <= j; k++) 
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // Brute force  Tc: O(n3)
    public static void max_subarray(int arr[]) {
        int currsum;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j <= arr.length - 1; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    currsum += arr[k];
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println(maxsum);
    }

    //Tc: O(n2)
    public static void max2_subarray(int arr[]) {
        int currsum;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }

        System.out.println(maxsum);

    }

    // Tc:O(n)
    public static void kadanes(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;


        for (int i = 0; i < arr.length; i++) {
            currsum = currsum + arr[i];

            if (currsum < 0) {
                currsum = 0;
            }

            maxsum = Math.max(maxsum, currsum);
        }

        System.out.println(maxsum);
    }

    public static void main(String[] args) {
        //int arr[] = { 1, 2, 4, 6, 8, 10 };
        int[] arr = {-5, -3, -8, -4, -9};
        // subarray(arr);
        // max_subarray(arr);
        max2_subarray(arr);
        kadanes(arr);
    }
}
