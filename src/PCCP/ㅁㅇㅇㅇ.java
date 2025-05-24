package PCCP;

import java.io.*;
import java.util.*;

public class ㅁㅇㅇㅇ {
    static final int SIZE = 5;
    static List<Point> pieces = new ArrayList<>();
    static int min = Integer.MAX_VALUE;

    static class Point {
        int x, y;
        Point(int a, int b) { x = a; y = b; }

        int dist(Point p) {
            return Math.abs(x - p.x) + Math.abs(y - p.y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] board = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            String line = br.readLine();
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = line.charAt(j);
                if (board[i][j] == '*') {
                    pieces.add(new Point(i, j));
                }
            }
        }

        // 연결된 좌표 조합 만들기
        boolean[][] visited = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                dfs(i, j, visited, new ArrayList<>(), pieces.size());
            }
        }

        System.out.println(min);
    }

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void dfs(int x, int y, boolean[][] visited, List<Point> list, int target) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE || visited[x][y]) return;
        list.add(new Point(x, y));
        visited[x][y] = true;

        if (list.size() == target) {
            if (isConnected(list)) {
                // 조각 위치 매칭해서 최소 거리 계산
                permute(new boolean[target], new ArrayList<>(), list);
            }
            visited[x][y] = false;
            list.remove(list.size() - 1);
            return;
        }

        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            dfs(nx, ny, visited, list, target);
        }

        visited[x][y] = false;
        list.remove(list.size() - 1);
    }

    static boolean isConnected(List<Point> list) {
        Queue<Point> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(list.get(0));
        visited.add(list.get(0).x + "," + list.get(0).y);

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            for (int d = 0; d < 4; d++) {
                int nx = p.x + dx[d];
                int ny = p.y + dy[d];
                Point np = new Point(nx, ny);
                for (Point check : list) {
                    if (check.x == nx && check.y == ny) {
                        String key = nx + "," + ny;
                        if (!visited.contains(key)) {
                            visited.add(key);
                            queue.add(np);
                        }
                        break;
                    }
                }
            }
        }
        return visited.size() == list.size();
    }

    static void permute(boolean[] used, List<Point> selected, List<Point> target) {
        if (selected.size() == pieces.size()) {
            int sum = 0;
            for (int i = 0; i < pieces.size(); i++) {
                sum += pieces.get(i).dist(selected.get(i));
            }
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < target.size(); i++) {
            if (!used[i]) {
                used[i] = true;
                selected.add(target.get(i));
                permute(used, selected, target);
                selected.remove(selected.size() - 1);
                used[i] = false;
            }
        }
    }
}
