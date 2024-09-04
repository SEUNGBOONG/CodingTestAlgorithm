package LV1.복습;

public class 최소공배수최대공약수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = (n < m)? n : m;
        int gcd = 0;

        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0)
                gcd = i;
        }

        answer[0] = gcd;

        answer[1] = n * m / gcd;
        return answer;

        //최대 공약수 : n과 m의 약수를 나열해 공통된것 중에 가장 큰것
        //소인수분해 해서 겹치는 부분들 끼리 곱셈

        //최소 공배수 : 두수의 공배수 중에 공통된 것 중에 가장 작은것
        //소인수분해 해서 지수가 큰것 x 공통되지 않는 소인수 끼리 곱셈

    }
}
