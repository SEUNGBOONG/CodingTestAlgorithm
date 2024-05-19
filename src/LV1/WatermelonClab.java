package LV1;

public class WatermelonClab {
    public String solution(int n) {
        String pattern = "수박";
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            answer.append(pattern.charAt(i % 2));
        }
        return answer.toString();

    }
}
