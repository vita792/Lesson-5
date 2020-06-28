package com.company;

import java.io.Serializable;

public class Car implements Comparable<Car>, Serializable {

    int speed;
    double weight;
    int seat;
    int quantity;



    public Car(int speed, double weight, int seat, int quantity) {
        this.speed = speed;
        this.weight = weight;
        this.seat = seat;
        this.quantity = quantity;
    }

    public Car() {
        this.speed = speed;
        this.weight = weight;
        this.seat = seat;
        this.quantity = quantity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public int compareTo(Car o) {
        int compareSpeed = (this.speed - o.getSpeed());
        return compareSpeed;
    }
    @Override
    public String toString() {
        String carString = "Car{" +
                "speed=" + speed +
                ", weight=" + weight +
                ", seat=" + seat +
                ", quantity=" + quantity +
                '}';
        return carString;
    }




}
