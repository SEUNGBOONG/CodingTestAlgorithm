package LV1;

public class BabblingChecker {
    public static boolean isValid(String str) {
        String[] words = {"aya", "ye", "woo", "ma"};
        String prev = "";

        int i = 0;
        while (i < str.length()) {
            boolean matched = false;
            for (String word : words) {
                if (str.startsWith(word, i)) {
                    // 같은 단어 연속 사용 금지
                    if (word.equals(prev)) {
                        return false;
                    }
                    prev = word;
                    i += word.length();
                    matched = true;
                    break;
                }
            }
            if (!matched) return false; // 어떤 단어와도 매칭 안 됨
        }
        return true;
    }

    public static void main(String[] args) {
        String[] inputs = {"ayaye", "wooaya", "ayaaya", "mama", "woowooma"};

        for (String str : inputs) {
            System.out.println(str + " -> " + isValid(str));
        }
    }
}
