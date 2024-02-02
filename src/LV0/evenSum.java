package LV0;

public class evenSum {
    public int solution(int n) {
        int answer = 0;
        int i;

        answer = getAnswer(n, answer);
        return answer;
    }
    private static int getAnswer(final int n, int answer) {
        int i;
        for(i=0; i<= n; i++){
           if(i%2==0) {
               answer +=i;
           }
        }
        return answer;
    }
}
