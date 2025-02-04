package 잡다;

import java.util.*;

public class 개발능력검사 {
    public String solution(int N, String[] W) {
        boolean[] visited = new boolean[W.length];

        for (int i = 0; i < W.length; i++) {
            visited[i] = false;
        }

        for(int i = 0; i < W.length; i++) {
            if (visited[i] == false) {
                dfs(i, visited, W);
            }
        }

        return null;
    }

    public void dfs(int N, boolean[] visited, String[] W) {
        visited[N] = true;

        for (int i = 0; i < W.length; i++) {
            if (visited[i] == false && W[N].startsWith(W[N+1])) {
                dfs(i, visited, W);
            }
        }
    }
}
