package com.github.hcsp.objectbasic;

public class Cat {
    public static int count = initStaticCount();

    static {
        System.out.println(2);
    }

    int age = initAge();
    String name;

    static {
        System.out.println(3);
    }

    static {
        System.out.println(4);
    }

    public int initAge() {
        System.out.println(5);
        return 0;
    }

    public static int initStaticCount() {
        System.out.println(1);
        return 0;
    }

    public Cat(String name) {
        this(0, name);
        System.out.println(7);
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(6);
    }
}
