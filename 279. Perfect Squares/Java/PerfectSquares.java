public class PerfectSquares {
    public static int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();
        int[] dist = new int[n + 1];
        for (int i = 0; i < dist.length; i++) dist[i] = Integer.MAX_VALUE;
        q.add(0);
        dist[0] = 0;
        while (q.size() != 0) {
            int t = q.element();
            q.remove();
            if (t == n) return dist[t];
            for (int i = 1; t + i * i <= n; i++) {
                int j = t + i * i;
                if (dist[j] > dist[t] + 1) {
                    dist[j] = dist[t] + 1;
                    q.add(j);
                }
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        System.out.println(numSquares(13));
    }
}