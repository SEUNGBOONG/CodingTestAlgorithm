package LV0;

public class mutipleArr {
    public int[] solution(int[] numbers) {
        int i;
        int[] answer=new int[numbers.length]; //배열 초기화 하는것을 기억하자
        for(i=0;i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }

}