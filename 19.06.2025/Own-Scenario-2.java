public class TSP {
    static int[][] cost = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };
    static boolean[] visited;
    static int minCost = Integer.MAX_VALUE;
    public static void tsp(int pos, int count, int costSum, int start) {
        if (count == cost.length && cost[pos][start] > 0) {
            minCost = Math.min(minCost, costSum + cost[pos][start]);
            return;
        }
        for (int i = 0; i < cost.length; i++) {
            if (!visited[i] && cost[pos][i] > 0) {
                visited[i] = true;
                tsp(i, count + 1, costSum + cost[pos][i], start);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        visited = new boolean[cost.length];
        visited[0] = true;
        tsp(0, 1, 0, 0);
        System.out.println("Minimum TSP cost: " + minCost);
    }
}
