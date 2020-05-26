public class FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        // 0ms 39.6MB
        // Speed pointer
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow; 
    }
}