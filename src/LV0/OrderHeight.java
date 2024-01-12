package LV0;

public class OrderHeight {
    public int solution(int[] array, int height) {
        int answer = 0;
        int i;

        for(i=0;i<array.length;i++){
            answer = getAnswer(array, height, i, answer);
        }
        return answer;
    }

    private static int getAnswer(final int[] array, final int height, final int i, int answer) {
        if(array[i]> height){
            answer++;
        }
        return answer;
    }
}
