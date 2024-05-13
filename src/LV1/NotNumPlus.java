package LV1;

public class NotNumPlus {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int num : numbers){
            answer-=num;
        }
        return answer;
    }
}
