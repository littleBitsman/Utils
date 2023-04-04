package me.littleBitsman;

public class YouAreAnIdiotException extends RuntimeException {
    public YouAreAnIdiotException() {
        super("YOU ARE AN IDIOT LOL \uD83D\uDC80\uD83D\uDC80\uD83D\uDDFF");
    }
    public YouAreAnIdiotException(String message) {
        super("YOU ARE AN IDIOT LOL \uD83D\uDC80\uD83D\uDC80\uD83D\uDDFF. YOUR EXCEPTION: " + message);
    }
}
