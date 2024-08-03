package ru.innopolis.java.basic_5_EXCEPTIONS.part3;

import ru.innopolis.java.basic_5_EXCEPTIONS.part3.exception.RobotConnectionException;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.impl.RobotConnectionManagerImpl;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.service.RobotConnection;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.service.RobotConnectionManager;

public class Main {
    private static final Integer ATTEMPTS = 3;

    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        RobotConnectionManager robotConnectionManager = new RobotConnectionManagerImpl(robot);

        try {
            moveRobot(robotConnectionManager, 3, 5);
        } catch (RobotConnectionException e) {
            System.err.println("Ошибка при запуске робота " + e.getMessage());
        }

        System.out.println("Финальная позиция робота: " + robot.getX() + " " + robot.getY());
    }

    private static void moveRobot(final RobotConnectionManager connectionManager, int toX, int toY) {
        for (int i = 0; i < ATTEMPTS; i++) {
            try (RobotConnection connection = connectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                i = ATTEMPTS;
            } catch (RobotConnectionException e) {
                throw new RobotConnectionException("Failed to connect after several attempts");
            }
        }
    }
}
