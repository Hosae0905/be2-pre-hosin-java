package numberbaseball;

import java.util.ArrayList;

public class Computer {

    ArrayList<Integer> computerNum = new ArrayList<>();

    public void createComputer() {

        //TODO: 컴퓨터 숫자 생성
        while (computerNum.size() < 3) {
            int randomNum = (int) (Math.random() * 9) + 1;
            if (!computerNum.contains(randomNum)) {
                computerNum.add(randomNum);
            }
        }
    }
}
