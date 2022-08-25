package Cafe.cafeshop.exception;

public class NotEnoughStockException extends RuntimeException {

    public NotEnoughStockException() {
        super();
    }

    public NotEnoughStockException(String message) {
        super(message);
    }

    public NotEnoughStockException(String message, Throwable cause) { //메세지와,예외가 발생한 근원적 요인
        super(message, cause);
    }

    public NotEnoughStockException(Throwable cause) {
        super(cause);
    }


}
