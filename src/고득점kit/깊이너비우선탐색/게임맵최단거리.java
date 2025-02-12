package 고득점kit.깊이너비우선탐색;

import java.util.Stack;

public class 게임맵최단거리 {
    public int solution(int[][] maps) {
        int answer = 0;
        boolean[][] visited = new boolean[maps.length][];
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps.length; j++) {
                visited[i][j] = false;
            }
        }

        int i = 0;
        int j = 0;
        while (true) {
           dfs(maps, visited,answer,i,j);
        }

    }

    public void dfs(int[][] maps, boolean[][] visited, int answer, int i, int j) {
        answer += maps[i][j];
        visited[i][j] = true;
        if (maps[i][j + 1] == 1 && !visited[i][j]) {
            j++;
        }
    }
}
