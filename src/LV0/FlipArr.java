package LV0;

public class FlipArr {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        extracted(num_list, answer);
        return answer;
    }

    private static void extracted(final int[] num_list, final int[] answer) {
        for(int i = num_list.length - 1; i >= 0; i--){
            answer[num_list.length - 1 - i] = num_list[i];
        }
    }

}
