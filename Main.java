package com.company;

import java.io.Serializable;
import java.util.Arrays;

public class Main extends Car {

    public static void main(String[] args) {
	Car car1 = new Car(200, 2.5, 4, 10);
	    car1.speed = 200;
	    car1.weight = 2.5;
	    car1.seat = 4;
	    car1.quantity = 10;

	Car car2 = new Car(180, 2.3, 2, 2);
        car2.speed = 180;
        car2.weight = 2.3;
        car2.seat = 2;
        car2.quantity = 2;
	Car car3 = new Car(210, 2.0, 2, 5);
        car3.speed = 210;
        car3.weight = 2.0;
        car3.seat = 2;
        car3.quantity = 5;

	Car car4 = new Car(160, 5.5, 9, 4);
        car4.speed = 160;
        car4.weight = 5.5;
        car4.seat = 9;
        car4.quantity = 4;

	Car car5 = new Car(150, 4, 6, 3);
        car5.speed = 150;
        car5.weight = 4;
        car5.seat = 6;
        car5.quantity = 3;

        Car car = new Car();

	Car[] cars = {car1, car2, car3, car4, car5};
	 for (Car c : cars)
	     System.out.println(c);
         System.out.println(cars);
         System.out.println(car1.equals(car4));
         System.out.println();
    Arrays.sort(cars);
    for (Car c : cars){
        System.out.println(c);
    }

    }
}
