package com.github.hcsp.objectbasic;

public class Cat {


    static {
        System.out.print(1+" ");
    }

    //int age = initAge();
     String name;

    {
        System.out.print(2+" ");
    }

    {
        System.out.print(3+" ");
    }

    int age = initAge();

    public int initAge() {
        System.out.print(4+" ");
        return 0;
    }
    int count = initStaticCount();
    public static int initStaticCount() {
        System.out.print(5+" ");
        return 0;
    }

    public Cat(String name) {

        this(0, name);
        System.out.print(7);
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.print(6+" ");

    }
}
