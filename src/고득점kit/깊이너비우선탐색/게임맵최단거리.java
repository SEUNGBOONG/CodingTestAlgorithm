package 고득점kit.깊이너비우선탐색;

import java.util.Stack;

public class 게임맵최단거리 {
    public int solution(int[][] maps) {
        int answer = 0;
        boolean[][] visited = new boolean[maps.length][maps[0].length];

        int i = 0, j = 0;
        // 목표지점까지 DFS 탐색
        answer = dfs(maps, visited, i, j, 0);  // 0은 시작 거리

        return answer == -1 ? -1 : answer;  // 목표 지점에 도달하지 못하면 -1 반환
    }

    public int dfs(int[][] maps, boolean[][] visited, int i, int j, int distance) {
        // 목표지점에 도달한 경우
        if (i == maps.length - 1 && j == maps[0].length - 1) {
            return distance + 1;  // 목표지점까지 거리
        }

        visited[i][j] = true;
        int minDistance = Integer.MAX_VALUE;  // 최소 거리를 찾기 위한 변수

        // 4방향 탐색
        if (i + 1 < maps.length && maps[i + 1][j] == 1 && !visited[i + 1][j]) {
            int result = dfs(maps, visited, i + 1, j, distance + 1);
            if (result != -1) minDistance = Math.min(minDistance, result);
        }
        if (j + 1 < maps[0].length && maps[i][j + 1] == 1 && !visited[i][j + 1]) {
            int result = dfs(maps, visited, i, j + 1, distance + 1);
            if (result != -1) minDistance = Math.min(minDistance, result);
        }
        if (i - 1 >= 0 && maps[i - 1][j] == 1 && !visited[i - 1][j]) {
            int result = dfs(maps, visited, i - 1, j, distance + 1);
            if (result != -1) minDistance = Math.min(minDistance, result);
        }
        if (j - 1 >= 0 && maps[i][j - 1] == 1 && !visited[i][j - 1]) {
            int result = dfs(maps, visited, i, j - 1, distance + 1);
            if (result != -1) minDistance = Math.min(minDistance, result);
        }

        visited[i][j] = false;  // 다른 경로 탐색을 위해 visited 초기화
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;  // 목표지점에 도달할 수 없으면 -1 반환
    }
}
