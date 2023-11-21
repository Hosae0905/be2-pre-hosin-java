package lotto.view;

import lotto.controller.Lotto;
import lotto.exception.OutOfBoundsException;

import java.util.*;

public class UserLotto {

    public Lotto createUserLottoNum() {

        List<Integer> inputLottoNum = new ArrayList<>();

        System.out.print("당첨 번호를 입력해주세요(1 ~ 45까지의 번호). ");

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");

        if(input.length != 6) {
            throw new OutOfBoundsException();
        } else {
            for (int i = 0; i < input.length; i++) {
                inputLottoNum.add(i, Integer.parseInt(input[i]));
            }
        }

        Collections.sort(inputLottoNum);

        System.out.print("보너스 번호를 입력해주세요(1 ~ 45까지의 번호). ");
        int bonus = sc.nextInt();

        return new Lotto(inputLottoNum);
    }
}
