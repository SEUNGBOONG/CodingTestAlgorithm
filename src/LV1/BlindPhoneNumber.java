package LV1;


public class BlindPhoneNumber {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();
        String[] num = phone_number.split("");

        int len = num.length;

        for (int i = 0; i < len; i++) {
            if (i < len - 4)
                answer.append("*");
            else
                answer.append(num[i]);
        }

        return answer.toString();
    }
}
