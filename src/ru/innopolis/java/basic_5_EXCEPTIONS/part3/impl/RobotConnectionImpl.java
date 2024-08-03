package ru.innopolis.java.basic_5_EXCEPTIONS.part3.impl;

import ru.innopolis.java.basic_5_EXCEPTIONS.part3.Direction;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.Robot;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.exception.RobotConnectionException;
import ru.innopolis.java.basic_5_EXCEPTIONS.part3.service.RobotConnection;

public class RobotConnectionImpl implements RobotConnection {
    private final Robot robot;
    private boolean closed;

    public RobotConnectionImpl(final Robot robot) {
        this.robot = robot;
    }

    @Override
    public void moveRobotTo(int targetX, int targetY) throws RobotConnectionException {
        if (closed) {
            throw new RobotConnectionException("Соединение уже закрыто");
        }
        moveRobotToInternal(targetX, targetY);
    }

    private void moveRobotToInternal(int targetX, int targetY) {
        int currentX = robot.getX();
        int currentY = robot.getY();
        System.out.println("Начальная позиция робота " + currentX + " " + currentY + ". " +
                "Направление: " + robot.getDirection());

        // Двигаемся по горизонтали
        if (currentX >= targetX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (currentX != targetX) {
                robot.stepForward();
                System.out.println("currextX >= targetX " + robot.getX() + " " + robot.getY() + ". " +
                        "Направление взгляда " + robot.getDirection());
                currentX--;
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (currentX != targetX) {
                robot.stepForward();
                System.out.println("currextX >= targetX " + robot.getX() + " " + robot.getY() + ". " +
                        "Направление взгляда " + robot.getDirection());
                currentX++;
            }
        }

        // Двигаемся по вертикали
        if (currentY >= targetY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (currentY != targetY) {
                robot.stepForward();
                System.out.println("currentY >= targetY " + robot.getX() + " " + robot.getY() + ". " +
                        "Направление взгляда " + robot.getDirection());
                currentY--;
            }
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (currentY != targetY) {
                robot.stepForward();
                System.out.println("currentY >= targetY " + robot.getX() + " " + robot.getY() + ". " +
                        "Направление взгляда " + robot.getDirection());
                currentY++;
            }
        }
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Connection closed");
    }
}
