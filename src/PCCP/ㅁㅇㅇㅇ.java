package PCCP;

import java.io.*;

public class ㅁㅇㅇㅇ {
    static int N;
    static int[][] price;
    static int[][] dp; // dp[state][last] = 최대 교환 횟수
    static int max = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        price = new int[N][N];
        dp = new int[1 << N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                price[i][j] = line.charAt(j) - '0';
            }
        }

        dfs(1, 0, 0); // state = 1 (0번 사람 방문), last = 0, cost = 0
        System.out.println(max);
    }

    static void dfs(int state, int last, int cost) {
        if (dp[state][last] >= cost) return;
        dp[state][last] = cost;
        int count = Integer.bitCount(state);
        max = Math.max(max, count);

        for (int i = 0; i < N; i++) {
            if ((state & (1 << i)) == 0 && price[last][i] >= cost) {
                dfs(state | (1 << i), i, price[last][i]);
            }
        }
    }
}
