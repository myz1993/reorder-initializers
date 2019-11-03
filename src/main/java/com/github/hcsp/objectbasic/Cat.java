package com.github.hcsp.objectbasic;

public class Cat {
    //1.静态成员初始化
    public static int count = initStaticCount();
    //2.静态初始化块
    static {
        System.out.println(2);
    }

    //3.成员初始化
    int age = initAge();
    String name;

    //4.初始化块
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