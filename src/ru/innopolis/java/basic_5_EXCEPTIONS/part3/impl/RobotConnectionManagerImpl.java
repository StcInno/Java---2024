package ru.innopolis.java.basic_5_EXCEPTIONS.part3.impl;

import ru.innopolis.java.basic_5_EXCEPTIONS.part3.Robot;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.service.RobotConnection;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.service.RobotConnectionManager;

public class RobotConnectionManagerImpl implements RobotConnectionManager {
    private final Robot robot;

    public RobotConnectionManagerImpl(final Robot robot) {
        this.robot = robot;
    }

    @Override
    public RobotConnection getConnection() {
        return new RobotConnectionImpl(robot);
    }
}
