package lotto.exception;

public class NumberException extends IllegalArgumentException {

    private static final String ERROR_MSG_OUT_OF_BOUNDS = "[Error] 로또 번호는 1부터 45 사이의 숫자여야 합니다.";
    public NumberException() {
        super(ERROR_MSG_OUT_OF_BOUNDS);
    }
}
