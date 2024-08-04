package 기능별.정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//6 10 2

//[3, 30, 34, 5, 9]	"9534330"

// 10이넘는 숫자들은 따로 보관 그다음 앞자맄기리 비교  6 2
// 일의자리 숫자도 따로 보관   10
//
public class 가장큰수 {
    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (str[0].equals("0")) {
            return "0";
        }

        return String.join("", str);
    }
}
