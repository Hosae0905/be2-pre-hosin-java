package numberbaseball;

public class BaseBallStarter {

    public void start() {
        User user = new User();
        Computer computer = new Computer();
        NumberBall game = new NumberBall();

        System.out.println("숫자 야구 게임을 시작합니다.");

        //TODO: 유저 숫자 생성
        computer.createComputer();
        user.createUser();

        //TODO: 숫자 야구 진행
        game.numberBall(user, computer);

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        return;
    }
}
