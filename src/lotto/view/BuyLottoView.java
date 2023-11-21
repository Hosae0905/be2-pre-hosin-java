package lotto.view;

import lotto.exception.NumberException;

import java.util.Scanner;

public class BuyLottoView {
    public int buyLotto() {

        System.out.print("로또를 구입하실 금액을 입력해주세요. (1000원 단위로 입력) ");

        Scanner sc = new Scanner(System.in);
        int totalLotto = sc.nextInt();

        if (totalLotto % 1000 != 0) {
            throw new NumberException();
        }

        return totalLotto / 1000;
    }
}
