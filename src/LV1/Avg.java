package LV1;

public class Avg {
    public double solution(int[] arr) {
        double sum = 0;
        double answer = 0;
        int i;
        for(i=0;i<arr.length; i++){
            sum +=arr[i];
        }
        answer= sum/(i);
        return answer;
    }
}
