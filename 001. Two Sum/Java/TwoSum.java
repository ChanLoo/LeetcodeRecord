import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    class Solution {
        // 2ms 39.9MB
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashmap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (hashmap.containsKey(diff)) {
                    return new int[] {i, hashmap.get(diff)};
                } else {
                    hashmap.put(nums[i], i);
                }
            }
            // throw new IllegalArgumentException("No two sum solution");
            return new int[] {};
        }
    }
}