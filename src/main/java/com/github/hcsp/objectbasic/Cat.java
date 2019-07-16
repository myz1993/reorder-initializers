package com.github.hcsp.objectbasic;

public class Cat {
    int age = initAge();
    int count = initStaticCount();

    static {
        System.out.println(1);
    }


    String name;

    static {
        System.out.println(2);
    }

    static {
        System.out.println(3);
    }

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

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(6);
        System.out.println(7);
    }
}
