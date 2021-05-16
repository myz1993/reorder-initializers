package com.github.hcsp.objectbasic;

public class Cat {
    static {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
    }
    static int age = initAge();
    public static int initAge() {
        System.out.println(4);
        return 0;
    }
    public static int count = initStaticCount();
    public static int initStaticCount() {
        System.out.println(5);
        return 0;
    }
    public Cat(int age, String name) {
        this.age = age;
        System.out.println(6);
        this.name = name;
    }
    public Cat(String name) {
        this(0, name);
        System.out.println(7);
    }
    String name;
}
