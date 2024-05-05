package LV0;

public class MiddleValue {
    public int solution(int[] array) {
        int middleIndex = array.length % 2;
        int answer = 0;
        if (middleIndex == 1){
            middleIndex++;
        }
        answer=array[middleIndex];
        return answer;
    }
}
