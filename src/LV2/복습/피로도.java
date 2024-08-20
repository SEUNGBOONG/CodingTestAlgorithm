package LV2.복습;

public class 피로도 {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        boolean[] visited = new boolean[dungeons.length];


        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] > k) {
                answer++;
                visited[i]=true;
                k=k-dungeons[i][1];
            }
            if(dungeons[i][0]<k){
                continue;
            }
        }

        return answer;
    }

}
