package LV1;

public class 크기가작은부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i + p.length());
            if(Long.parseLong(sub) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}
