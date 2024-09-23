package 고득점kit.정렬;


import java.util.Arrays;

public class 가장큰수2 {

    public static String solution(int[] numbers) {

        String[] str = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2 + o1)
                .compareTo(o1 + o2));
        if(str[0].equals("0")){
            return "0";
        }
        return String.join("",str);
    }
}
