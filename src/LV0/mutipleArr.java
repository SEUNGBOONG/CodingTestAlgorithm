package LV0;

public class mutipleArr {
    public int[] solution(int[] numbers) {
        int i;
        int[] answer={};
        for(i=0;i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }

}
