package lotto.controller;


import lotto.view.AutoLotto;
import lotto.view.BuyLottoView;
import lotto.view.UserLotto;

public class LottoStarter {
    public void start() {
        UserLotto lotto = new UserLotto();
        AutoLotto autoLotto = new AutoLotto();
        BuyLottoView buyLottoView = new BuyLottoView();
        LottoMatch match = new LottoMatch();

        int totalLotto = buyLottoView.buyLotto();


        Lotto userLottoNum = lotto.createUserLottoNum();        // 유저 로또 번호
        Lotto autoLottoNum = autoLotto.createAutoLottoNum(totalLotto);    // 로또 자동 생성

        match.lottoMatch(userLottoNum, autoLottoNum, totalLotto);
    }
}
