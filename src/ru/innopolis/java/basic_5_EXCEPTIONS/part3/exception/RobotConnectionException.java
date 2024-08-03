package ru.innopolis.java.basic_5_EXCEPTIONS.part3.exception;

public class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(final String message) {
        super(message);
    }

    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause); }
}
