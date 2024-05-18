package LV1;


public class MiddleStringReturn {
    public String solution(String s) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            if(s.length() % 2 == 0){
                answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
            }else{
                answer = s.substring(s.length() / 2, (s.length() / 2) + 1);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        MiddleStringReturn msr = new MiddleStringReturn();
        System.out.println(msr.solution("abcde"));   // Expected output: "c"
        System.out.println(msr.solution("qwer"));    // Expected output: "we"
    }
}
