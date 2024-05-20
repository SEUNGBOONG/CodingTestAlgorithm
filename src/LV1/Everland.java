package LV1;

public class Everland {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 1; i<=count; i++){
            answer += price * i ;
        }
        if(money<answer){
            answer = answer-money;
        }
        else if(money>=answer){
            answer = 0;
        }
        return answer;
    }

}
