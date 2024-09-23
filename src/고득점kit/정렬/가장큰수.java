package 고득점kit.정렬;

import java.util.Arrays;


//6 10 2

//[3, 30, 34, 5, 9]	"9534330"

// 30 34  는 /10 한 값들은
// 3,5,9 보관 여기다가 보관 그러면
// 정렬
//9 5 3 3 3
// 9 5 넣고
// 30 34 3 1의자리끼리 비교  0 4 3 이니까
// 34 넣고 3넣고 30 넣기
// 그러면 9534330 이된다.
// 3 ,5, 9
//

// 10이넘는 숫자들은 따로 보관 그다음 앞자맄기리 비교  6 2
// 일의자리 숫자도 따로 보관   10
//[3, 30, 34, 5, 9]	"9534330"
// 34 30 3 5 9
//5 34 30 3 9
// 9 5 34 30 3
public class 가장큰수 {
    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2 + o1)
                .compareTo(o1 + o2));

        if (str[0].equals("0")) {
            return "0";
        }

        return String.join("", str);
    }
}
