public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        List<int[]> res = new ArrayList<>();
        int l = intervals[0][0], r = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (r < intervals[i][0]) {
                res.add(new int[] {l, r});
                l = intervals[i][0];
                r = intervals[i][1];
            } else if (r >= intervals[i][0] && r < intervals[i][1]) {
                r = intervals[i][1];
            }
        }
        res.add(new int[] {l, r});
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] nums = {{0, 1}, {7, 8}, {0, 2}, {1, 3}, {4, 5}};
        temp T = new temp();
        nums = T.merge(nums);
        System.out.println(nums.toString());
    }
}