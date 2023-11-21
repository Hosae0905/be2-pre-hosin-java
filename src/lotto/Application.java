package lotto;

import lotto.controller.LottoStarter;
import lotto.exception.DuplicateException;
import lotto.exception.NumberException;
import lotto.exception.OutOfBoundsException;

public class Application {
    public static void main(String[] args) {
        LottoStarter starter = new LottoStarter();
        try {
            starter.start();
        } catch (NumberException e) {
            System.out.println(e.getMessage());
            starter.start();
        } catch (DuplicateException e) {
            System.out.println(e.getMessage());
            starter.start();
        } catch (OutOfBoundsException e) {
            System.out.println(e.getMessage());
            starter.start();
        }
    }
}
