package LV0;

public class protractor {
    public int solution(int angle) {
        int answer=0;
        if( angle>0 && angle<=180){
            answer = getAnswer(angle, answer);
        }

        return answer;
    }

    private static int getAnswer(final int angle, int answer) {
        if (angle <90){
            answer =1;
        }
        else if (angle ==90){
            answer =2;
        }
        else if (angle >90){
            answer =3;
        }
        else if (angle ==180){
            answer =4;
        }
        return answer;
    }
}
