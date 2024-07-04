package LV2;

import java.util.Arrays;

public class 해시전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                String num = Arrays.toString(phone_book[i].split(""));
                if (num.contains(phone_book[j])) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}

