public class Trapping_Rain_Water {
    static long trappingWater(int arr[], int n) {
        // Your code here
        long res = 0;
        int Lmax[] = new int[n];
        int Rmax[] = new int[n];

        Lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            Lmax[i] = Math.max(arr[i], Lmax[i - 1]);
        }

        Rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            Rmax[i] = Math.max(arr[i], Rmax[i + 1]);
        }

        for (int i = 0; i < n - 1; i++) {
            res += (Math.min(Lmax[i], Rmax[i]) - arr[i]);
        }

        return res;
    }
}
