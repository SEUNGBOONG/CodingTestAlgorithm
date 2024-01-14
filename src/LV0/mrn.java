package LV0;


//프로그래머스에 적응 하는 중 생각보다 쉽게 풀었음
public class mrn {
    public String solution(String rny_string) {
        String answer = getString(rny_string);
        if (answer != null) return answer;

        return rny_string;
    }

    private static String getString(final String rny_string) {
        if(rny_string.contains("m")){
            String answer = rny_string.replace("m","rn");
            return answer;
        }
        return null;
    }
    //

    public static void main(String[] args) {
        mrn a =new mrn();
        System.out.println(a.solution("jerry"));
    }
}
