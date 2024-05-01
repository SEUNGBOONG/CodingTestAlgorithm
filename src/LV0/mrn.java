package LV0;

public class mrn {
    public String solution(String rny_string) {
        if(rny_string.contains("m")){
            String answer = rny_string.replace("m","rn");
            return answer;
        }
        return rny_string;
    }
    //

    public static void main(String[] args) {
        mrn a =new mrn();
        System.out.println(a.solution("jerry"));
    }
}
