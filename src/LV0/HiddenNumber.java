package LV0;

public class HiddenNumber {
    public int solution(String my_string) {
        int answer = getAnswer(my_string);
        return answer;
    }

    private static int getAnswer(final String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char currentChar = my_string.charAt(i);
            answer = getAnswer(currentChar, answer);
        }
        return answer;
    }

    private static int getAnswer(final char currentChar, int answer) {
        if (Character.isDigit(currentChar)) {
            int digit = Character.getNumericValue(currentChar);
            answer += digit;
        }
        return answer;
    }
}
