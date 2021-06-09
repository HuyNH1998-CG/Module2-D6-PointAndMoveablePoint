package com.codegym;

public class MoveablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed, float x, float y) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.x = x;
        this.y = y;
    }

    public float getXSpeed() {
        return this.xSpeed;
    }

    public float getYSpeed() {
        return this.ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{this.getXSpeed(), this.getYSpeed()};
    }

    public String toString() {
        return "A point at x= " + super.getX() + ", y= " + super.getY() + ", speed= " + this.getXSpeed() + ", " + this.getYSpeed();
    }
    public MoveablePoint move(){
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return this;
    }
}
