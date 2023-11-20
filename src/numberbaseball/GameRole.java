package numberbaseball;

public class GameRole {

    int strike;
    int ball;
    int out;

    public void setStrike(int strike) {
        this.strike += strike;
    }

    public void setBall(int ball) {
        this.ball += ball;
    }

    public void setOut(int out) {
        this.out += out;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public int getOut() {
        return out;
    }

    //TODO: 기존 데이터 초기화
    public void clearRole() {
        this.strike = 0;
        this.ball = 0;
        this.out = 0;
    }
}
