package NumberBaseBall;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseBallStarter {

    public void start() throws IOException {
        User user = new User();
        NumberBall game = new NumberBall();

        System.out.println("숫자 야구 게임을 시작합니다.");

        //TODO: 유저 숫자 생성
        ArrayList<Integer> userTest = user.createUser();

        //TODO: 숫자 야구 진행
        game.numberBall(userTest);

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");

        Scanner sc = new Scanner(System.in);
        if (sc.nextInt() == 1) {
            user.clearUser(userTest);
            ArrayList<Integer> newUser = user.createUser();
            game.numberBall(newUser);
        } else if (sc.nextInt() == 2) {
            sc.close();
        } else {
            System.out.println("숫자를 다시 입력해주세요.");
        }
    }
}