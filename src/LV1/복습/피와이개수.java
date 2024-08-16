package LV1.복습;


public class 피와이개수 {

    boolean solution(String s) {

        int pCount = 0;
        int yCount = 0;


        String[] a;
        a= s.split("");
        for(int i = 0; i<a.length; i++){
            if(a[i]=="p" || a[i]=="P"){
                pCount++;
            }
            else if(a[i]=="y"||a[i]=="Y"){
                yCount++;
            }
        }

        return pCount==yCount;

    }

    public static void main(String[] args) {
        피와이개수 d = new 피와이개수();
        System.out.println(d.solution("pPoooyY"));

    }
}
