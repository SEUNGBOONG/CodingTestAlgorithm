package LV0;

public class Letter {
    public String solution(String my_string) {
        // 주어진 문자열을 문자 배열로 변환
        char[] chars = my_string.toCharArray();

        // 각 문자의 대소문자를 변환
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) { // 대문자인 경우
                chars[i] = Character.toLowerCase(chars[i]); // 대문자를 소문자로 변환
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
