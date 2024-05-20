package LV1;

import java.util.ArrayList;
import java.util.List;

public class OnlyNum {
    public boolean solution(String s) {
        if(!(s.length()==4||s.length()==6))
            return false;
        {
            try{
                int isNum= Integer.valueOf(s); // parseInt 도 가능
            }catch (Exception e ){
                return false;
            }
        }
        return true;

    }
}
