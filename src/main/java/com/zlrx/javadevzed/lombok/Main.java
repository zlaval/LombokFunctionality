package com.zlrx.javadevzed.lombok;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Erik");
        person.setAge(4);
        System.out.println(person);
    }
}
