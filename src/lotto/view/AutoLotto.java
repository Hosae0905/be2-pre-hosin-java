package lotto.view;

import lotto.controller.Lotto;

import java.util.ArrayList;
import java.util.Collections;

public class AutoLotto {
    private final ArrayList<Integer> autoNum = new ArrayList<>();
    public Lotto createAutoLottoNum(int totalLotto) {

        while (autoNum.size() < 6) {
            int lottoNum = (int)(Math.random() * 45 + 1);
            if (!autoNum.contains(lottoNum)) {
                autoNum.add(lottoNum);
            }
        }
        Collections.sort(autoNum);
        System.out.printf("로또를 %d개 구매하셨습니다.\n", totalLotto);
        System.out.println(autoNum);

        return new Lotto(autoNum);
    }
}