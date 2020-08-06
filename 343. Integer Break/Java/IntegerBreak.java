public class IntegerBreak {
    public int integerBreak(int n) {
        if (n <= 3) return 1 * (n - 1);
        int res = 1;
        if (n % 3 == 1) {
            res = 4;
            n -= 4;
        } else if (n % 3 == 2) {
            res = 2;
            n -= 2;
        }
        while (n != 0) {
            res *= 3;
            n -= 3;
        }
        return res;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
