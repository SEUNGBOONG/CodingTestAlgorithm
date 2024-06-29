package LV0;

public class 길이에따른연산 {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list.length >= 11) {
                sum += num_list[i];
            } else if (num_list.length <= 10) {
                product *= num_list[i];
            }
            if (num_list.length >= 11) {
                answer = sum;
            } else if (num_list.length <= 10) {
                answer = product;
            }
        }
        return answer;
    }
}
