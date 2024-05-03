package LV0;

public class babblingSpeak {
    public int solution(String[] babbling) {
        int answer = 0;
        babbling = new String[]{"aya", "ye", "woo", "ma"};
        for (int i = 0; i < 4; i++) {
            if (speak.contains(babbling[i])) {
                answer++;
            }
        }
        return answer;
        System.out.println(answer);

    }

}

