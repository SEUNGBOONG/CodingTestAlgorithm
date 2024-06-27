package LV0;

public class 홀짝에따라다른값 {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = n; i > 0; ) {
                answer += (i * i);
                i -= 2;
            }
        } else {
            for (int i = n; i > 0; ) {
                answer += i;
                i -= 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        홀짝에따라다른값 a = new 홀짝에따라다른값();
        System.out.println(a.solution(7));
    }
}
