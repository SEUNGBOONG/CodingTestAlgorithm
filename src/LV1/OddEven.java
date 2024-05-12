package LV1;

public class OddEven {
    public String solution(int num) {
        String answer = "Odd";
        if(num%2==0){
            answer="Even";
        }
        return answer;
    }
}
