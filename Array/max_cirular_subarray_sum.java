
public class max_cirular_subarray_sum {

    public static int normalmaxsum(int arr[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        return ms;
    }

    public static int overallmaxsum(int arr[]) {
        int max_normal = normalmaxsum(arr);
        if (max_normal < 0) {
            return max_normal;
        }

        // We have change sign of each element it an array because we have to find min
        // normal array sum by kadanes algo.
        // But kadanes algo give output for max number.So to get minimum sum we change
        // sign of each element.
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        // Since we have change sign of element so instead of substracting it from
        // arr_sum we have added it.
        int max_cirular = arr_sum + normalmaxsum(arr);

        System.out.println(Math.max(max_normal, max_cirular));
        return Math.max(max_normal, max_cirular);
    }

    public static void main(String[] args) {
        int arr[] = { 8, -4, 3, -5, 4 };
        overallmaxsum(arr);
    }
}
