package 고득점kit.깊이너비우선탐색;

public class 단어변환 {
    private int minSteps = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
        boolean exists = false;
        boolean[] visit = new boolean[words.length];

        for (String word : words) {
            if (word.equals(target)) {
                exists = true;
                break;
            }
        }
        if (!exists) return 0;

        dfs(begin,target,words,visit,0);

        return minSteps == Integer.MAX_VALUE ? 0 : minSteps;
    }
    private void dfs(String current, String target, String[] words, boolean[] visit,int depth){
        if (current.equals(target)) {
            minSteps = Math.min(minSteps, depth);
            return;
        }

        for (int i = 0; i<words.length; i++){
            if (!visit[i] && canConvert(current,words[i])) {
                visit[i] = true;
                dfs(words[i],target,words,visit,depth+1);
                visit[i]=false;
            }
        }
    }
    private boolean canConvert(String word1, String word2) {
        int count = 0; // 다른 글자 개수

        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                count++; // 다른 글자가 있으면 증가
            }
            if (count > 1) return false; // 2글자 이상 다르면 변환 불가능
        }
        return count == 1; // 정확히 1글자만 다를 경우에만 변환 가능
    }
}
