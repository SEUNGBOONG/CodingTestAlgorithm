package LV1;

public class SquareRoot {
    public long solution(long n) {
        long answer;
        double num= Math.sqrt(n);
        double num2 = n/num;
        if(num % 1 == 0) {
            answer = (long) Math.pow(num + 1, 2);
        }
        else answer = -1;
        return answer;
    }
}
