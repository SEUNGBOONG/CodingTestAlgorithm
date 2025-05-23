package PCCP;
import java.util.*;

public class add {

        static int N;
        static int[][] price;
        static int[][] dp;

        // dfs(current: 현재 사람 번호, visited: 방문 비트마스크, lastPrice: 직전에 산 가격)
        static int dfs(int current, int visited, int lastPrice) {
            if (dp[visited][current] != -1) {
                return dp[visited][current];
            }

            int max = 1; // 현재 사람 포함

            for (int i = 0; i < N; i++) {
                if ((visited & (1 << i)) == 0 && price[current][i] >= lastPrice) {
                    int nextVisited = visited | (1 << i);
                    max = Math.max(max, dfs(i, nextVisited, price[current][i]) + 1);
                }
            }

            dp[visited][current] = max;
            return max;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            N = sc.nextInt();
            price = new int[N][N];
            dp = new int[1 << N][N];

            for (int i = 0; i < N; i++) {
                String s = sc.next();
                for (int j = 0; j < N; j++) {
                    price[i][j] = s.charAt(j) - '0';
                }
            }

            for (int i = 0; i < (1 << N); i++) {
                Arrays.fill(dp[i], -1);
            }

            // 0번째 사람부터 시작, 방문 비트마스크: 1 << 0, 가격: 0
            System.out.println(dfs(0, 1, 0));
        }

}
