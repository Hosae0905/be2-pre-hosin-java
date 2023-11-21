package lotto.view;

import java.util.ArrayList;

public class ShowLottoNum {

    ArrayList<Integer> showNum;
    int totalLotto;
    private void showLottoNum(ArrayList<Integer> autoNum, int totalLotto) {
        System.out.printf("로또를 %d개를 구매하셨습니다.", totalLotto);
        System.out.println(autoNum.toString());
    }

    public ShowLottoNum(ArrayList<Integer> autoNum, int totalLotto) {
        this.showNum = autoNum;
        this.totalLotto = totalLotto;
        showLottoNum(showNum, totalLotto);
    }
}
