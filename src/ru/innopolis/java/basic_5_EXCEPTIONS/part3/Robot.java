package ru.innopolis.java.basic_5_EXCEPTIONS.part3;

public class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        switch (direction) {
            case DOWN -> direction = Direction.RIGHT;
            case UP -> direction = Direction.LEFT;
            case RIGHT -> direction = Direction.UP;
            case LEFT -> direction = Direction.DOWN;
        }
    }

    public void turnRight() {
        switch (direction) {
            case DOWN -> direction = Direction.LEFT;
            case UP -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.DOWN;
            case LEFT -> direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (direction) {
            case DOWN -> y--;
            case UP -> y++;
            case RIGHT -> x++;
            case LEFT -> x--;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
