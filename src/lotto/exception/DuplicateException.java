package lotto.exception;

public class DuplicateException extends IllegalArgumentException{
    private static final String ERROR_MSG_DUPLICATE_NUM = "[Error] 로또 번호는 중복되면 안 됩니다.";

    public DuplicateException() {
        super(ERROR_MSG_DUPLICATE_NUM);
    }
}
