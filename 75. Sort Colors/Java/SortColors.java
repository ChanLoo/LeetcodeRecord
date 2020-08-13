public class SortColors {
    public void sortColors(int[] nums) {
        // 0ms 38.1MB Counting Sort
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        for (int i = 0, j = 0; i < 3; i++) {
            while (count[i] != 0) {
                nums[j++] = i;
                count[i]--;
            }
        }
    }
}