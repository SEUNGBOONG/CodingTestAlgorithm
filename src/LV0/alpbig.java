package LV0;

public class alpbig {
    public String solution(String my_string, String alp) {
        if (my_string.contains(alp)) {
            String toUpper = alp.toUpperCase();
            String answer = my_string.replace(alp, toUpper);
            return answer;
        }
        return my_string;
    }


    public static void main(String[] args) {
        alpbig a = new alpbig();
        System.out.println(a.solution("prog", "e"));
    }
}
