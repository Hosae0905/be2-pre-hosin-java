package lotto.exception;

public class OutOfBoundsException extends IllegalArgumentException{
    private static final String ERROR_MSG_OUT_OF_BOUNDS = "[Error] 입력하실 숫자는 총 6개 입니다.";

    public OutOfBoundsException() {
        super(ERROR_MSG_OUT_OF_BOUNDS);
    }
}
