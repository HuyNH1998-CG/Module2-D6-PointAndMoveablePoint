package com.codegym;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        Point point1 = new Point(5.0f, 4.0f);
        System.out.println(point);
        System.out.println(point1);

        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        MoveablePoint moveablePoint1 = new MoveablePoint(5.0f, 4.0f, 10.0f,15.0f);
        System.out.println(moveablePoint1);
        moveablePoint1.move();
        System.out.println(moveablePoint1);
    }
}
