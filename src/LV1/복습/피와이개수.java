package LV1.복습;


public class 피와이개수 {

    boolean solution(String s) {

        s=s.toLowerCase();
        int pCount = 0;
        int yCount = 0;


        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            if(a=='p'){
                pCount++;
            }
            else if(a == 'y'){
                yCount++;
            }
        }

        return pCount==yCount;

    }

    public static void main(String[] args) {
        피와이개수 d = new 피와이개수();
        System.out.println(d.solution("pPY"));

    }
}
