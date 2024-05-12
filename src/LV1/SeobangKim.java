package LV1;

public class SeobangKim {
    public String solution(String[] seoul) {
        int i=0;
        for(String s: seoul){
            if(s.equals("kim")){
                break;
            } else
                i+=1;
        }
        return String.format("김서방은 %d에 있다", i);
    }
}
