package numberbaseball;

import java.io.IOException;
import java.util.ArrayList;

public class NumberBall {

    static GameRole role = new GameRole();

    public void numberBall(User user, Computer computer) {

        while (role.getStrike() != 3) {

            numberDiff(computer, user);     // 컴퓨터와 유저의 숫자를 비교

            if (role.getStrike() == 3) {
                break;
            } else if (role.getOut() == 3){
                System.out.println("낫싱");
            } else {
                System.out.printf("%d스트라이크 %d볼 %d 아웃입니다.\n", role.getStrike(), role.getBall(), role.getOut());
            }

            role.clearRole();           // 숫자 야구 데이터를 초기화 및 유저 숫자를 초기화
            user.createUser();          // 유저의 숫자를 다시 입력받기
        }

        System.out.printf("%d스트라이크 입니다.\n", role.getStrike());
    }

    //TODO: 숫자를 비교
    public void numberDiff(Computer computer, User user) {

        ArrayList<Integer> numList = new ArrayList<>();
        char[] charArray = user.userNum.toCharArray();

        for (int i = 0; numList.size() < 3; i++) {
            numList.add(i, (charArray[i] - '0'));
        }

        for (int i = 0; i < computer.computerNum.size(); i++) {
            int num1 = computer.computerNum.get(i);        // 컴퓨터가 가지고 있는 숫자
            int num2 = numList.get(i);         // 유저가 가지고 있는 숫자

            if (num1 == num2) {
                role.setStrike(1);
            } else if (computer.computerNum.contains(num2)) {
                role.setBall(1);
            } else if (!computer.computerNum.contains(num2)){
                role.setOut(1);
            }
        }


    }
}
