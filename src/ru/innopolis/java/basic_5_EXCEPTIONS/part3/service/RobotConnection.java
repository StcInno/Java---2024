package ru.innopolis.java.basic_5_EXCEPTIONS.part3.service;

import ru.innopolis.java.basic_5_EXCEPTIONS.part3.exception.RobotConnectionException;

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y) throws RobotConnectionException;

    @Override
    void close();
}
