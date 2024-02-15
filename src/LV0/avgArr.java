package LV0;

public class avgArr {
    public double solution(int[] numbers, int i) {
        double sum = 0; //처음에는 여기서 int로 선언해서 평균 값 구할 떄 테스트가 전부 다 맞진 않았다.
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double answer = (sum / numbers.length);
        return answer;
    }
}

