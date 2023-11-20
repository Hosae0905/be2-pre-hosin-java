package numberbaseball;

import java.io.IOException;
import java.util.ArrayList;

public class NumberBall {

    static GameRole role = new GameRole();

    public void numberBall(ArrayList<Integer> user) throws IOException {

        User userNum = new User();

        ArrayList<Integer> computer = new ArrayList<>();
        //TODO: 컴퓨터 숫자 생성
        while (computer.size() < 3) {
            int randomNum = (int) (Math.random() * 10);
            if (!computer.contains(randomNum)) {
                computer.add(randomNum);
            }
        }

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
            user = userNum.createUser();   // 유저의 숫자를 다시 입력받기
        }

        System.out.printf("%d스트라이크 입니다.\n", role.getStrike());
    }

    //TODO: 숫자를 비교
    public void numberDiff(ArrayList<Integer> computer, ArrayList<Integer> user) {

        for (int i = 0; i < computer.size(); i++) {
            int num1 = computer.get(i);     // 컴퓨터가 가지고 있는 숫자
            int num2 = user.get(i);         // 유저가 가지고 있는 숫자

            if (num1 == num2) {
                role.setStrike(1);
            } else if (computer.contains(num2)) {
                role.setBall(1);
            } else if (!computer.contains(num2)){
                role.setOut(1);
            }
        }


    }
}
