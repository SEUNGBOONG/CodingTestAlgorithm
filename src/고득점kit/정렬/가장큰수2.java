package 고득점kit.정렬;


import java.util.Arrays;

public class 가장큰수2 {

    public static String solution(int[] numbers) {

        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (s1, s2) -> (s2 + s1)
                .compareTo(s1 + s2));
        if(str[0].equals("0")){
            return "0";
        }
        return String.join("",str);
    }
}
