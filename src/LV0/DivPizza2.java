package LV0;

public class DivPizza2 {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n%slice==0){
            answer=(n/slice);
        }
        else{
            answer=(n/slice)+1;
        }
        return answer;
    }
}
