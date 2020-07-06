public class KthLargestElementinaStream {

    private PriorityQueue<Integer> pq;
    private int N;

    public KthLargest(int k, int[] nums) {
        N = k;
        pq = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }
    
    public int add(int val) {
        if (pq.size() < N) {
            pq.add(val);
        } else if (pq.peek() < val) {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
}