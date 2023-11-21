package lotto.view;

import lotto.lottoInfo.LottoInfo;

public class StatisticsView {

    int lottoCount;
    int totalLotto;

    public StatisticsView(int lottoCount, int totalLotto) {
        this.lottoCount = lottoCount;
        this.totalLotto = totalLotto * 1000;
    }

    public void viewResult() {      // 구매한 금액, 당첨된 구간?

        LottoInfo lottoInfo = new LottoInfo();

        System.out.println("당첨 통계");
        System.out.println("---");

        System.out.printf("3개 일치 (5,000원) - %d개\n", lottoInfo.getThree());
        System.out.printf("4개 일치 (50,000원) - %d개\n", lottoInfo.getFour());
        System.out.printf("5개 일치 (1,500,000원) - %d개\n", lottoInfo.getFive());
//        System.out.printf("%5개 일치 (30,000,000원) - %d개\n", lottoCount);
        System.out.printf("6개 일치 (2,000,000,000원) - %d개\n", lottoInfo.getSix());

        long total = (lottoInfo.getThree() * 5000) + (lottoInfo.getFour() * 50000) +
                (lottoInfo.getFive() * 150000) + (lottoInfo.getSix() * 2000000000);

        if(total != 0) {
            System.out.printf("총 수익률은 %2.f 입니다.", totalLotto / total);
        } else {
            System.out.println("총 수익률은 0% 입니다.");
        }
    }


}
