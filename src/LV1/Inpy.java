package LV1;

public class Inpy {
    boolean solution(String s) {
        String strp = String.valueOf(countChar(s, 'p'));
        String stry = String.valueOf(countChar(s, 'y'));
        boolean answer = false;
        if (strp.equals(stry)) {
            answer = true;
        }

        return answer;
    }

    public static long countChar(String s, char ch) {
        return s.chars()
                .filter(c -> c == ch)
                .count();
    }
}
