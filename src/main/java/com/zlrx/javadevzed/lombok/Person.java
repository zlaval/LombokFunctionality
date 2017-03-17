package com.zlrx.javadevzed.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
class Person {
    private final String name;
    private int age;
}
