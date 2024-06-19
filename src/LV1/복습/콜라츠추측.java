package LV1.복습;

public class 콜라츠추측 {
    public int solution(int num) {
        long n = num;
        int answer = 0;
        while (n!=1){
            if(num%2==0){
                n/=2;
            } else
                n=n*3+1;
            answer++;
            if(answer>500){
                return -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠추측 a = new 콜라츠추측();
        System.out.println(a.solution(6));
        System.out.println(a.solution(16));
        System.out.println(a.solution(41));
        System.out.println(a.solution(626331));

    }
}
