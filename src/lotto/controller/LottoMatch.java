package lotto.controller;

import lotto.lottoInfo.LottoInfo;
import lotto.view.StatisticsView;

import java.util.List;

public class LottoMatch {
    public void lottoMatch(Lotto user, Lotto auto, int totalLotto) {

        LottoInfo lottoInfo = new LottoInfo();
        int lottoCount = 0;

        List<Integer> userLotto = user.getNumbers();
        List<Integer> autoLotto = auto.getNumbers();

        for (int i = 0; i < autoLotto.size(); i++) {
            if(autoLotto.contains(userLotto.get(i))) {
                lottoCount++;
            }
        }

        if (lottoCount == 3) {
            lottoInfo.setThree(1);
        } else if (lottoCount == 4) {
            lottoInfo.setFive(1);
        } else if (lottoCount == 5) {
            lottoInfo.setFive(1);
        } else if (lottoCount == 6) {
            lottoInfo.setSix(1);
        }

        StatisticsView statisticsView = new StatisticsView(lottoCount, totalLotto);
        statisticsView.viewResult();
    }
}
