package edu.hw2.Task3;

public class ConnectionException extends RuntimeException {
    public ConnectionException(Exception cause) {
        super(cause);
    }

    public ConnectionException() {}

    public ConnectionException(String string) {
        super(string);
    }

    public ConnectionException(String string, Exception cause) {
        super(string, cause);
    }
}
