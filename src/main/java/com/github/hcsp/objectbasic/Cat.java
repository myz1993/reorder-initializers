package com.github.hcsp.objectbasic;

public class Cat {
    // step 1
    public static int count = initStaticCount();
    // step 2
    static {
        System.out.println(2);
    }
    // step 3
    int age = initAge();
    String name;

    // step 4 , 5
    {
        System.out.println(4);
    }

    {
        System.out.println(5);
    }

    public int initAge() {
        System.out.println(3);
        return 0;
    }

    public static int initStaticCount() {
        System.out.println(1);
        return 0;
    }
    // step 7
    public Cat(String name) {
        this(0, name);
        System.out.println(7);
    }
    // step 6
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(6);
    }
}
