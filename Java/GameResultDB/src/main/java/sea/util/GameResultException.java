package sea.util;

public class GameResultException extends Exception {
    public GameResultException(String message) {
        super(message);
    }

    public GameResultException(String message, Throwable cause) {
        super(message, cause);
    }
}
