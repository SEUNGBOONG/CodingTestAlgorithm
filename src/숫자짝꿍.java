import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 숫자짝꿍 {
    public String solution(String x, String y) {
        String answer = "";
        List<String> list = List.of(x.split(""));
        List<String> list2 = List.of(y.split(""));
        List<String> num = new ArrayList<>();

        for(int i =0; i<list.size();i++){
            for(int j =0; j<list2.size();j++){
                if(list.get(i).equals(list2.get(j))){
                    num.add(list2.get(j));
                }
                else{
                    return "-1";
                }
            }
        }


        num.sort(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (String s : num) {
            sb.append(s);
        }
        return sb.toString();
    }
}
