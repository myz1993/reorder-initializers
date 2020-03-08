package com.github.hcsp.objectbasic;

public class Cat {
    public static int count = initStaticCount();//1

    static {//2
        //System.out.println(1);
        System.out.println(2);
    }

    int age = initAge();//3
    String name;

    {
        //System.out.println(2);
        System.out.println(4);//4
    }

    {
        //System.out.println(3);
        System.out.println(5);//5
    }

    public int initAge() {
        //System.out.println(4);
        System.out.println(3);
        return 0;
    }

    public static int initStaticCount() {
        System.out.println(1);
        //System.out.println(5);
        return 0;
    }

    public Cat(String name) {//7
        this(0, name);
        //System.out.println(6);
        System.out.println(7);
    }

    public Cat(int age, String name) {//6
        this.age = age;
        this.name = name;
        //System.out.println(7);
        System.out.println(6);
    }
}
