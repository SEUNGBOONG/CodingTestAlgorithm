package LV0;

public class emphasizeA {
    public String solution(String myString) {
        String lowerString=myString.toLowerCase();
        String answer =lowerString.replace("a","A");
        return answer;
    }

    public static void main(String[] args) {
        emphasizeA a =new emphasizeA();
        System.out.println(a.solution("PRdadoadadq"));
    }
}

