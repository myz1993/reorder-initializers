package com.github.hcsp.objectbasic;

public class Cat {
    static {
        System.out.println(1);
    }

    {
        System.out.println(2);
    }

    {
        System.out.println(3);
    }

    int age = initAge();
    String name;

    public int count = initStaticCount(); // 5


    public int initAge() {
        System.out.println(4);
        return 0;
    }

    public int initStaticCount() {
        System.out.println(5);
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
