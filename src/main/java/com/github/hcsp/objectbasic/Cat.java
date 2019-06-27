package com.github.hcsp.objectbasic;
//Java中,类的初始化顺序为:静态变量>静态初始化块>变量>初始化块>构造器
public class Cat {
    public static int count = initStaticCount();//静态变量1

    static {//静态初始化块2
        System.out.println(2);
    }

    int age = initAge();//变量
    String name;//变量

    {
        System.out.println(4);
    }//初始化块4

    {
        System.out.println(5);
    }//初始化块5

    public int initAge() {
        System.out.println(3);
        return 0;
    }//变量

    public static int initStaticCount() {
        System.out.println(1);
        return 0;
    }//静态初始化块
//构造器1
    public Cat(String name) {
        this(0, name);
        System.out.println(7);
    }
//构造器2
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(6);
    }
}
