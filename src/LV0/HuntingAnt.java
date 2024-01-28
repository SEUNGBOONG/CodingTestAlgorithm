package LV0;

public class HuntingAnt {
    public int solution(int hp) {
        int answer = 0;
        int generalAnt, soldierAnt,workAnt;
        generalAnt=(hp/5);
        hp=(hp%5);
        soldierAnt=(hp/3);
        hp=hp%3;
        workAnt=hp/1;
        Result result = new Result(generalAnt, soldierAnt, workAnt);
        answer= result.generalAnt() + result.soldierAnt() + result.workAnt();
        return answer;
    }

    private record Result(int generalAnt, int soldierAnt, int workAnt) {
    }
}
