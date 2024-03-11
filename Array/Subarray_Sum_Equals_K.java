import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k)
                count++;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
