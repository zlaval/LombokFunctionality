package com.zlrx.javadevzed.lombok;

import lombok.extern.java.Log;
import lombok.val;

@Log
public class Main {

    public static void main(String[] args) {
        Person person = new Person("Erik");
        person.setAge(4);
        System.out.println(person);

        Car car = new Car("Mazda", 2);


        Home home = Home.builder()
                .address("Budapest")
                .price(10_000_000)
                .roomNumber(1)
                .squareMeter(30.6)
                .storey(false).build();

        LogExample logExample = new LogExample();
        logExample.logMethod();

        val me = new Person("Zalan");
        System.out.println(me);
    }
}
