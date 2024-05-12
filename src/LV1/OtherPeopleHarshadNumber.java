package LV1;

public class OtherPeopleHarshadNumber {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        String[] numArr=str.split("");
        int sum=0;

        for(String num:numArr){
            sum+=Integer.parseInt(num);
        }
        return (x%sum==0? true:false);
    }
}
