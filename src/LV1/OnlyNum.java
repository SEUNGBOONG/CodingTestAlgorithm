package LV1;

import java.util.ArrayList;
import java.util.List;

public class OnlyNum {
    public boolean solution(String s) {
        if(!(s.length()==4||s.length()==6))
            return false;
        {
            try{
                int isNum= Integer.valueOf(s);
//                int isNum2= Integer.parseInt(s); 둘다 가능
            }catch (Exception e ){
                return false;
            }
        }
        return true;

    }
}
